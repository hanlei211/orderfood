package com.hlc.sell.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class User  implements Serializable {

    public  String Name;

    public  String  Age;

    public User(String Name, String Age) {
        this.Name = Name;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                '}';
    }
}
