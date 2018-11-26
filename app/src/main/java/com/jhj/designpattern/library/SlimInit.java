package com.jhj.designpattern.library;

import android.content.Context;

public class SlimInit {

    private Attribute attribute;

    public Attribute init(Context mContext) {
        attribute = new Attribute(mContext);
        return attribute;
    }

    //===========================
    //根据需求做其他处理...

    public String getName() {
        return attribute.getName();
    }

    public int getAge() {
        return attribute.getAge();
    }

    public String getGender() {
        return attribute.getGender();
    }

    public String getEducation() {
        return attribute.getEducation();
    }

    public void print() {
        attribute.print();
    }


}
