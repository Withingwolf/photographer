package com.withing.photographer.domain;

import com.withing.photographer.converter.*;

public enum UserType implements EnumsID {
    visitor(0, "游客"),
    client(1, "普通用户"),
    admin(2, "管理员"),
    root(3, "超级用户");

    private int privilige;

    private String decription;

    UserType() {
    }

    UserType(String decription) {
        this.decription = decription;
    }

    UserType(int privilige, String decription) {
        this.privilige = privilige;
        this.decription = decription;
    }

    public static UserType getUserType(int privilige) {
        switch (privilige) {
            case 1:
                return client;
            case 2:
                return admin;
            case 3:
                return root;
            default:
                return visitor;
        }
    }

    public int getPrivilige() {
        return privilige;
    }

    public String getDecription() {
        return decription;
    }

    @Override
    public String getText() {
        return decription;
    }

    @Override
    public Integer getId() {
        return privilige;
    }
}
