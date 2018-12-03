package com.withing.photographer.domain;

import java.sql.*;

public class User {

    private int id;

    private String email;

    private String phoneNumber;

    private String name;

    private String password;

    private Timestamp createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public enum userType {
        client(1, "普通用户"),
        admin(2, "管理员"),
        root(3, "超级用户");

        private int privilige;

        private String decription;

        userType(){}

        userType(int privilige, String decription) {
            this.privilige = privilige;
            this.decription = decription;
        }
    }


}
