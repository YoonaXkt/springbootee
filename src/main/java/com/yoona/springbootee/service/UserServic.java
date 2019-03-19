package com.yoona.springbootee.service;

import com.yoona.springbootee.entity.User;

import java.util.List;

public interface UserServic {
    public List<User> findAll();

    public User findByid(int id);

    public int add(User user);

    public void datele(int id);

    public int update(User user);
}
