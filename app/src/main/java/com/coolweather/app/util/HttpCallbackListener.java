package com.coolweather.app.util;

/**
 * Created by Kevin on 2016/5/24.
 */

    public interface HttpCallbackListener{
        void onFinish(String response);

        void onError(Exception e);
    }

