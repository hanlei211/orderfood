package com.hlc.sell.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User  implements Serializable {

    public  String name;

    public  String  age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
