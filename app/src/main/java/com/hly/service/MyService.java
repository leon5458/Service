package com.hly.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("----------服务创建","111111111111");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.e("----------服务调用","111111111111");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("----------服务销毁","111111111111");
    }
}
