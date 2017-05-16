package com.coolweather.android.gson;

/**
 * Created by 廖智涌 on 2017/5/16.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
