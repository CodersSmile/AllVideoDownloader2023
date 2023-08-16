package com.video.music.downloader.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.google.firebase.messaging.FirebaseMessaging;
import com.video.music.downloader.AdsUtils.FirebaseADHandlers.AdUtils;
import com.video.music.downloader.AdsUtils.FirebaseADHandlers.AdsJsonPOJO;
import com.video.music.downloader.AdsUtils.FirebaseADHandlers.FirebaseUtils;
import com.video.music.downloader.AdsUtils.Interfaces.AppInterfaces;
import com.video.music.downloader.AdsUtils.PreferencesManager.AppPreferencesManger;
import com.video.music.downloader.AdsUtils.Utils.Constants;
import com.video.music.downloader.AdsUtils.Utils.Global;
import com.video.music.downloader.AdsUtils.Utils.StringUtils;
import com.video.music.downloader.R;

public class SplashActivity extends AppCompatActivity {
    Thread timer;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_splash);
        activity = SplashActivity.this;
        AppPreferencesManger appPreferencesManger = new AppPreferencesManger(this);
        FirebaseMessaging.getInstance().subscribeToTopic(Constants.ADSJSON);

        Constants.adsJsonPOJO = Global.getAdsData(appPreferencesManger.getAdsModel());

        if (Constants.adsJsonPOJO != null && !StringUtils.isNull(Constants.adsJsonPOJO.getParameters().getApp_open_ad().getDefaultValue().getValue())) {
            Constants.adsJsonPOJO = Global.getAdsData(appPreferencesManger.getAdsModel());
            Constants.hitCounter = Integer.parseInt(Constants.adsJsonPOJO.getParameters().getApp_open_ad().getDefaultValue().getHits());
//            Constants.adsJsonPOJO.getParameters().getShowAd().getDefaultValue().setValue("false");
            AdUtils.showAppOpenAd(activity, new AppInterfaces.AppOpenADInterface() {
                @Override
                public void appOpenAdState(boolean state_load) {
//                    rltest.setVisibility(View.VISIBLE);
                    nextActivity();
//                    startActivity(new Intent(SplashActivity.this, OnboardingActivity.class));
//                    startActivity(new Intent(SplashScreenActivity.this, Homepage.class));
                }
            });


        } else {
            FirebaseUtils.initiateAndStoreFirebaseRemoteConfig(activity, new AppInterfaces.AdDataInterface() {
                @Override
                public void getAdData(AdsJsonPOJO adsJsonPOJO) {
                    //Need to call this only once per
                    appPreferencesManger.setAdsModel(adsJsonPOJO);
                    Constants.adsJsonPOJO = adsJsonPOJO;
                    Constants.hitCounter = Integer.parseInt(Constants.adsJsonPOJO.getParameters().getApp_open_ad().getDefaultValue().getHits());
//                    Constants.adsJsonPOJO.getParameters().getShowAd().getDefaultValue().setValue("false");
                    AdUtils.showAppOpenAd(activity, new AppInterfaces.AppOpenADInterface() {
                        @Override
                        public void appOpenAdState(boolean state_load) {
//                            rltest.setVisibility(View.VISIBLE);
                            nextActivity();
//                            startActivity(new Intent(SplashActivity.this, OnboardingActivity.class));
                        }
                    });
                }
            });
//
        }


//        Log.e("user", userId);

    }
//
    public void nextActivity(){
        timer = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized (this) {
                        wait(3000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true);
                    if (isFirstRun) {

                        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Intent intent = new Intent(SplashActivity.this, DashboardActivity.class);
                        startActivity(intent);
                        finish();
                    }

                    getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("isFirstRun", false).commit();

                }
            }
        };
        timer.start();

    }
}