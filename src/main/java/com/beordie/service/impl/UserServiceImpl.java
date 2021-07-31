package com.beordie.service.impl;

import com.beordie.mapper.UserMapper;
import com.beordie.model.User;
import com.beordie.service.IUserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Date 2021/7/28 11:20
 * @Created 30500
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public User selectByUser(String name, String password) {
        Map<String, String> params = new HashMap<>();
        params.put("name", name);
        params.put("password", password);
        return userMapper.selectByUser(params);
    }
}
