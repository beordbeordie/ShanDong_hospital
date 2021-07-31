package com.beordie.mapper;

import com.beordie.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @Description 用户映射接口
 * @Date 2021/7/28 9:56
 * @Created 30500
 */
public interface UserMapper {

    /**
     * @description 根据主键ID查询相关的用户信息
     * @author 30500
     * @date 2021/7/28 11:14
     * @type [int 用户的主键ID]
     * @return com.beordie.model.User 查询的用户单条记录
     */
    public User selectById(int id);

    /**
     * @description 根据用户名和密码查询用户信息
     * @author 30500
     * @date 2021/7/28 11:15
     * @type [java.util.Map<java.lang.String,java.lang.String> 用户名、密码]
     * @return com.beordie.model.User 查询的用户单条记录
     */
    public User selectByUser(Map<String, String> params);
}
