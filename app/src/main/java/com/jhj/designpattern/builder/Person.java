package com.jhj.designpattern.builder;

public class Person {
    private String name;
    private String gender;
    private int age;
    private String education;

    private Person(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
        this.education = builder.education;
    }

    //其他处理
    //...

    class Builder {

        private String name;
        private String gender;
        private int age;
        private String education;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }


        public Builder setAge(int age) {
            this.age = age;
            return this;
        }


        public Builder setEducation(String education) {
            this.education = education;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
