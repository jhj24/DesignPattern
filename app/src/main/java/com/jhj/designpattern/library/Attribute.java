package com.jhj.designpattern.library;

import android.content.Context;
import android.widget.Toast;

public class Attribute {

    private String name;
    private String gender;
    private int age;
    private String education;
    private Context mContext;

    public Attribute(Context mContext) {
        this.mContext = mContext;
    }


    //===================================
    //根据需求设置属性。。。


    public String getName() {
        return name;
    }

    public Attribute setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Attribute setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Attribute setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public Attribute setEducation(String education) {
        this.education = education;
        return this;
    }


    public void print() {
        Toast.makeText(mContext, "姓名：" + getName() + "\n性别：" + getGender() + "\n年龄：" + getAge() + "\n教育程度：" + getEducation(), Toast.LENGTH_SHORT).show();
    }
}
