package com.video.music.downloader.AdsUtils.FirebaseADHandlers;

public class AdsJsonPOJO {

    private ParametersDTO parameters = new ParametersDTO();
    private VersionDTO version = new VersionDTO();

    public ParametersDTO getParameters() {
        return parameters;
    }

    public void setParameters(ParametersDTO parameters) {
        this.parameters = parameters;
    }

    public VersionDTO getVersion() {
        return version;
    }

    public void setVersion(VersionDTO version) {
        this.version = version;
    }

    public static class ParametersDTO {
        private PageShowDTO pageShow = new PageShowDTO();
        private BannerIdDTO banner_id=new BannerIdDTO();
        private AppOpenAd1DTO app_open_ad1=new AppOpenAd1DTO();
        private NativeIdDTO native_id=new NativeIdDTO();
        private ShowAdDTO showAd=new ShowAdDTO();
        private AppOpenAdDTO app_open_ad=new AppOpenAdDTO();
        private RewardedAdDTO rewarded_ad=new RewardedAdDTO();
        private FullIdDTO full_id=new FullIdDTO();
        private NativeHDTO native_h=new NativeHDTO();

        public PageShowDTO getPageShow() {
            return pageShow;
        }

        public void setPageShow(PageShowDTO pageShow) {
            this.pageShow = pageShow;
        }

        public BannerIdDTO getBanner_id() {
            return banner_id;
        }

        public void setBanner_id(BannerIdDTO banner_id) {
            this.banner_id = banner_id;
        }

        public AppOpenAd1DTO getApp_open_ad1() {
            return app_open_ad1;
        }

        public void setApp_open_ad1(AppOpenAd1DTO app_open_ad1) {
            this.app_open_ad1 = app_open_ad1;
        }

        public NativeIdDTO getNative_id() {
            return native_id;
        }

        public void setNative_id(NativeIdDTO native_id) {
            this.native_id = native_id;
        }

        public ShowAdDTO getShowAd() {
            return showAd;
        }

        public void setShowAd(ShowAdDTO showAd) {
            this.showAd = showAd;
        }

        public AppOpenAdDTO getApp_open_ad() {
            return app_open_ad;
        }

        public void setApp_open_ad(AppOpenAdDTO app_open_ad) {
            this.app_open_ad = app_open_ad;
        }

        public RewardedAdDTO getRewarded_ad() {
            return rewarded_ad;
        }

        public void setRewarded_ad(RewardedAdDTO rewarded_ad) {
            this.rewarded_ad = rewarded_ad;
        }

        public FullIdDTO getFull_id() {
            return full_id;
        }

        public void setFull_id(FullIdDTO full_id) {
            this.full_id = full_id;
        }

        public NativeHDTO getNative_h() {
            return native_h;
        }

        public void setNative_h(NativeHDTO native_h) {
            this.native_h = native_h;
        }

        public static class PageShowDTO {
            private DefaultValueDTO defaultValue =new DefaultValueDTO();
            private String valueType ="";

            public DefaultValueDTO getDefaultValue() {
                return defaultValue;
            }

            public void setDefaultValue(DefaultValueDTO defaultValue) {
                this.defaultValue = defaultValue;
            }

            public String getValueType() {
                return valueType;
            }

            public void setValueType(String valueType) {
                this.valueType = valueType;
            }

            public static class DefaultValueDTO {
                private String value ="";

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class BannerIdDTO {
            private DefaultValueDTO defaultValue =new DefaultValueDTO();
            private String valueType="";

            public DefaultValueDTO getDefaultValue() {
                return defaultValue;
            }

            public void setDefaultValue(DefaultValueDTO defaultValue) {
                this.defaultValue = defaultValue;
            }

            public String getValueType() {
                return valueType;
            }

            public void setValueType(String valueType) {
                this.valueType = valueType;
            }

            public static class DefaultValueDTO {
                private String value;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class AppOpenAd1DTO {
            private DefaultValueDTO defaultValue=new DefaultValueDTO();
            private String valueType = "";

            public DefaultValueDTO getDefaultValue() {
                return defaultValue;
            }

            public void setDefaultValue(DefaultValueDTO defaultValue) {
                this.defaultValue = defaultValue;
            }

            public String getValueType() {
                return valueType;
            }

            public void setValueType(String valueType) {
                this.valueType = valueType;
            }

            public static class DefaultValueDTO {
                private String value="";

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class NativeIdDTO {
            private DefaultValueDTO defaultValue=new DefaultValueDTO();
            private String valueType="";

            public DefaultValueDTO getDefaultValue() {
                return defaultValue;
            }

            public void setDefaultValue(DefaultValueDTO defaultValue) {
                this.defaultValue = defaultValue;
            }

            public String getValueType() {
                return valueType;
            }

            public void setValueType(String valueType) {
                this.valueType = valueType;
            }

            public static class DefaultValueDTO {
                private String value="";

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class ShowAdDTO {
            private DefaultValueDTO defaultValue =new DefaultValueDTO();
            private String valueType="";

            public DefaultValueDTO getDefaultValue() {
                return defaultValue;
            }

            public void setDefaultValue(DefaultValueDTO defaultValue) {
                this.defaultValue = defaultValue;
            }

            public String getValueType() {
                return valueType;
            }

            public void setValueType(String valueType) {
                this.valueType = valueType;
            }

            public static class DefaultValueDTO {
                private String value="";

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class AppOpenAdDTO {
            private DefaultValueDTO defaultValue = new DefaultValueDTO();
            private String valueType = "";


            public DefaultValueDTO getDefaultValue() {
                return defaultValue;
            }

            public void setDefaultValue(DefaultValueDTO defaultValue) {
                this.defaultValue = defaultValue;
            }

            public String getValueType() {
                return valueType;
            }

            public void setValueType(String valueType) {
                this.valueType = valueType;
            }

            public static class DefaultValueDTO {
                private String value;
                private String hits = "";

                public String getHits() {
                    return hits;
                }

                public void setHits(String hits) {
                    this.hits = hits;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class RewardedAdDTO {
            private DefaultValueDTO defaultValue=new DefaultValueDTO();
            private String valueType="";

            public DefaultValueDTO getDefaultValue() {
                return defaultValue;
            }

            public void setDefaultValue(DefaultValueDTO defaultValue) {
                this.defaultValue = defaultValue;
            }

            public String getValueType() {
                return valueType;
            }

            public void setValueType(String valueType) {
                this.valueType = valueType;
            }

            public static class DefaultValueDTO {
                private String value="";

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class FullIdDTO {
            private DefaultValueDTO defaultValue=new DefaultValueDTO();
            private String valueType="";

            public DefaultValueDTO getDefaultValue() {
                return defaultValue;
            }

            public void setDefaultValue(DefaultValueDTO defaultValue) {
                this.defaultValue = defaultValue;
            }

            public String getValueType() {
                return valueType;
            }

            public void setValueType(String valueType) {
                this.valueType = valueType;
            }

            public static class DefaultValueDTO {
                private String value="";

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class NativeHDTO {
            private DefaultValueDTO defaultValue=new DefaultValueDTO();
            private String valueType="";

            public DefaultValueDTO getDefaultValue() {
                return defaultValue;
            }

            public void setDefaultValue(DefaultValueDTO defaultValue) {
                this.defaultValue = defaultValue;
            }

            public String getValueType() {
                return valueType;
            }

            public void setValueType(String valueType) {
                this.valueType = valueType;
            }

            public static class DefaultValueDTO {
                private String value="";

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }

    public static class VersionDTO {
        private String versionNumber="";
        private String updateTime="";
        private UpdateUserDTO updateUser=new UpdateUserDTO();
        private String updateOrigin="";
        private String updateType="";

        public String getVersionNumber() {
            return versionNumber;
        }

        public void setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public UpdateUserDTO getUpdateUser() {
            return updateUser;
        }

        public void setUpdateUser(UpdateUserDTO updateUser) {
            this.updateUser = updateUser;
        }

        public String getUpdateOrigin() {
            return updateOrigin;
        }

        public void setUpdateOrigin(String updateOrigin) {
            this.updateOrigin = updateOrigin;
        }

        public String getUpdateType() {
            return updateType;
        }

        public void setUpdateType(String updateType) {
            this.updateType = updateType;
        }

        public static class UpdateUserDTO {
            private String email;

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }
    }

}