package com.beordie.test;

import com.beordie.mapper.DoctorMapper;
import com.beordie.mapper.RegisterMapper;
import com.beordie.mapper.UserMapper;
import com.beordie.model.Doctor;
import com.beordie.model.Register;
import com.beordie.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Date 2021/7/28 9:26
 * @Created 30500
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class MyBatisTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RegisterMapper registerMapper;

    @Autowired
    private DoctorMapper doctorMapper;
    @Test
    public void test() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void test1() {
        Register register = registerMapper.selectByPrimaryKey(1);
        System.out.println(register);
    }

    @Test
    public void test2() {
        List<Integer> integers = doctorMapper.selectIdByName("力");
        integers.forEach(id-> System.out.println(id));
    }

}
