package com.example.dly.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Dly on 2017/4/9.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {  //传入请求地址，注册回调处理服务器响应
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        okHttpClient.newCall(request).enqueue(callback);
    }

}
