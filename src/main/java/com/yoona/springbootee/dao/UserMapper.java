package com.yoona.springbootee.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yoona.springbootee.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

}