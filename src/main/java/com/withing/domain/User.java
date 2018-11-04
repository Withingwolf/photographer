package com.withing.domain;

import org.hibernate.annotations.GenericGenerator;

@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class User {
    private int id;
    private String name;
    private String psw;
//    Date createTime;
//    Date expireTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String password) {
        this.psw = password;
    }

//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    public Date getExpireTime() {
//        return expireTime;
//    }
//
//    public void setExpireTime(Date expireTime) {
//        this.expireTime = expireTime;
//    }
}
