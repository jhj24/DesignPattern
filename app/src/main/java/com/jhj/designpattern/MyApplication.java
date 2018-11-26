package com.jhj.designpattern;

import android.app.Application;

import com.jhj.designpattern.library.CommonUtil;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        CommonUtil.init(this)
                .setName("张三");


    }
}
