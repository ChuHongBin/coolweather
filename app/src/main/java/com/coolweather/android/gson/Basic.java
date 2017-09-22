package com.coolweather.android.gson;

/**
 * Created by 褚洪宾 on 2017/9/21.
 */
import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
       @SerializedName("loc")
        public String updataTime;
    }
}
