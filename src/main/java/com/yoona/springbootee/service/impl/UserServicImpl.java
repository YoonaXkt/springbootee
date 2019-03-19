package com.yoona.springbootee.service.impl;

import com.yoona.springbootee.dao.UserMapper;
import com.yoona.springbootee.entity.User;
import com.yoona.springbootee.service.UserServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServicImpl implements UserServic {
    @Autowired
    private UserMapper ud;

    @Override
    public List<User> findAll() {
        Map<String,Object> map = new HashMap<>();
        System.out.println(map.values());
        return ud.selectByMap(map);
    }

    @Override
    public User findByid(int id) {

        return ud.selectById(id);
    }

    @Override
    public int add(User user) {
        int count = ud.insert(user);
        return count;
    }

    @Override
    public void datele(int id) {
        ud.deleteById(id);
    }

    @Override
    public int update(User user) {
        int count = ud.updateById(user);
        return count;
    }
}
