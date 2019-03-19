package com.yoona.springbootee.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String sex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public User(Integer id, String name, String sex, Date date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    public User() {
    }


}