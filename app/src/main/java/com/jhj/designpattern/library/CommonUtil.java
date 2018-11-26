package com.jhj.designpattern.library;

import android.content.Context;

public class CommonUtil {

    private static SlimInit deal = new SlimInit();

    public static Attribute init(Context mContext) {
        return deal.init(mContext);
    }

    //=============================
    //　调用

    public static void print() {
        deal.print();
    }

}
