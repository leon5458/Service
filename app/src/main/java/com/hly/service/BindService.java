package com.hly.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class BindService extends Service {
    //初始化自定义的Binder对象
    private MyBinder mBinder = new MyBinder();

    public class MyBinder extends Binder {



        public void start() {
            Log.e("----------start", "start:");
        }

        public void end() {
            Log.e("-----------end", "end:");
        }


    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("------------hxm", "onCreate");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("------------hxm", "IBinder");
        return mBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("------------hxm", "onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("------------hxm", "onDestroy");
    }
}
