package com.jhj.designpattern.instance;

import android.content.Context;
import android.util.Log;

import java.lang.ref.WeakReference;

public class SingletonContext {

    private static volatile SingletonContext singleton;
    private final WeakReference<Context> mContext;

    private SingletonContext(Context context) {
        this.mContext = new WeakReference<>(context);
    }

    public static SingletonContext getInstance(Context context) {
        if (singleton == null) {
            synchronized (SingletonContext.class) {
                if (singleton == null) {
                    singleton = new SingletonContext(context);
                }
            }
        }
        return singleton;
    }


    //============

    void text() {
        if (mContext.get() != null) {
            Log.w("xxx", "Context不为空");
        }
    }
}