package com.beordie.service;

import com.beordie.model.User;

import java.util.Map;

/**
 * @Description
 * @Date 2021/7/28 11:17
 * @Created 30500
 */
public interface IUserService {

    /**
     * @description 根据主键查询用户信息
     * @author 30500
     * @date 2021/7/28 11:18
     * @type [int 主键ID]
     * @return com.beordie.model.User 插叙你的用户信息
     */
    public User selectById(int id);

    /**
     * @description 根据用户名和密码进行数据查询
     * @author 30500
     * @date 2021/7/28 11:20
     * @type [java.lang.String 用户名, java.lang.String 用户密码]
     * @return com.beordie.model.User 查询返回的用户信息
     */
    public User selectByUser(String name, String password);
}
