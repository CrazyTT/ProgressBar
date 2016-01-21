package com.chenliuliu.progressbar;

import java.util.List;

/**
 * Created by liuliuchen on 16/1/21.
 */
public class Testw {
    private String code;
    private int count;
    private Object data;
    private String message;
    private String tableName;
    private List<DataObjectEntity> dataObject;

    public void setCode(String code) {
        this.code = code;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setDataObject(List<DataObjectEntity> dataObject) {
        this.dataObject = dataObject;
    }

    public String getCode() {
        return code;
    }

    public int getCount() {
        return count;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public String getTableName() {
        return tableName;
    }

    public List<DataObjectEntity> getDataObject() {
        return dataObject;
    }

    public static class DataObjectEntity {
        /**
         * air : {"c6h6":"0","ch2o":"0","co2":"0","createTime":"1900-01-01 01:01:01","humidity":"0","name":"","pm25":"0","sensorId":"500004DF6A4A","shareContent":"","temperature":"0","voc":"0"}
         * alert : {"alertStatus":"","alertType":"","alertValue":"","creatTime":"","name":"","online":false,"sensorId":""}
         * ctrl : {}
         * gas : {}
         * localHardVersion : 00000003
         * localSoftVersion : 00000024
         * name :
         * online : false
         * remoteHardVersion :
         * remoteSoftVersion :
         * sensorId : 500004DF6A4A
         * viewName :
         */

        private List<SensorListEntity> sensorList;

        public void setSensorList(List<SensorListEntity> sensorList) {
            this.sensorList = sensorList;
        }

        public List<SensorListEntity> getSensorList() {
            return sensorList;
        }

        public static class SensorListEntity {
            /**
             * c6h6 : 0
             * ch2o : 0
             * co2 : 0
             * createTime : 1900-01-01 01:01:01
             * humidity : 0
             * name :
             * pm25 : 0
             * sensorId : 500004DF6A4A
             * shareContent :
             * temperature : 0
             * voc : 0
             */

            private AirEntity air;
            /**
             * alertStatus :
             * alertType :
             * alertValue :
             * creatTime :
             * name :
             * online : false
             * sensorId :
             */

            private AlertEntity alert;
            private CtrlEntity ctrl;
            private GasEntity gas;
            private String localHardVersion;
            private String localSoftVersion;
            private String name;
            private boolean online;
            private String remoteHardVersion;
            private String remoteSoftVersion;
            private String sensorId;
            private String viewName;

            public void setAir(AirEntity air) {
                this.air = air;
            }

            public void setAlert(AlertEntity alert) {
                this.alert = alert;
            }

            public void setCtrl(CtrlEntity ctrl) {
                this.ctrl = ctrl;
            }

            public void setGas(GasEntity gas) {
                this.gas = gas;
            }

            public void setLocalHardVersion(String localHardVersion) {
                this.localHardVersion = localHardVersion;
            }

            public void setLocalSoftVersion(String localSoftVersion) {
                this.localSoftVersion = localSoftVersion;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setOnline(boolean online) {
                this.online = online;
            }

            public void setRemoteHardVersion(String remoteHardVersion) {
                this.remoteHardVersion = remoteHardVersion;
            }

            public void setRemoteSoftVersion(String remoteSoftVersion) {
                this.remoteSoftVersion = remoteSoftVersion;
            }

            public void setSensorId(String sensorId) {
                this.sensorId = sensorId;
            }

            public void setViewName(String viewName) {
                this.viewName = viewName;
            }

            public AirEntity getAir() {
                return air;
            }

            public AlertEntity getAlert() {
                return alert;
            }

            public CtrlEntity getCtrl() {
                return ctrl;
            }

            public GasEntity getGas() {
                return gas;
            }

            public String getLocalHardVersion() {
                return localHardVersion;
            }

            public String getLocalSoftVersion() {
                return localSoftVersion;
            }

            public String getName() {
                return name;
            }

            public boolean isOnline() {
                return online;
            }

            public String getRemoteHardVersion() {
                return remoteHardVersion;
            }

            public String getRemoteSoftVersion() {
                return remoteSoftVersion;
            }

            public String getSensorId() {
                return sensorId;
            }

            public String getViewName() {
                return viewName;
            }

            public static class AirEntity {
                private String c6h6;
                private String ch2o;
                private String co2;
                private String createTime;
                private String humidity;
                private String name;
                private String pm25;
                private String sensorId;
                private String shareContent;
                private String temperature;
                private String voc;

                public void setC6h6(String c6h6) {
                    this.c6h6 = c6h6;
                }

                public void setCh2o(String ch2o) {
                    this.ch2o = ch2o;
                }

                public void setCo2(String co2) {
                    this.co2 = co2;
                }

                public void setCreateTime(String createTime) {
                    this.createTime = createTime;
                }

                public void setHumidity(String humidity) {
                    this.humidity = humidity;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setPm25(String pm25) {
                    this.pm25 = pm25;
                }

                public void setSensorId(String sensorId) {
                    this.sensorId = sensorId;
                }

                public void setShareContent(String shareContent) {
                    this.shareContent = shareContent;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public void setVoc(String voc) {
                    this.voc = voc;
                }

                public String getC6h6() {
                    return c6h6;
                }

                public String getCh2o() {
                    return ch2o;
                }

                public String getCo2() {
                    return co2;
                }

                public String getCreateTime() {
                    return createTime;
                }

                public String getHumidity() {
                    return humidity;
                }

                public String getName() {
                    return name;
                }

                public String getPm25() {
                    return pm25;
                }

                public String getSensorId() {
                    return sensorId;
                }

                public String getShareContent() {
                    return shareContent;
                }

                public String getTemperature() {
                    return temperature;
                }

                public String getVoc() {
                    return voc;
                }
            }

            public static class AlertEntity {
            }

            public static class CtrlEntity {
            }

            public static class GasEntity {
            }
        }
    }
}
