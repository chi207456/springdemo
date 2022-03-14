package com.sxgroup.springclient.bean;

import lombok.Data;

import java.io.Serializable;

@Data()
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private int age;
    private int sex;
    private String birthday;
    private String created;
    private String updated;
    private String note;


}