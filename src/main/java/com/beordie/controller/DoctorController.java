package com.beordie.controller;

import com.beordie.bean.DoctorBean;
import com.beordie.bean.Message;
import com.beordie.bean.RegisterBean;
import com.beordie.model.Doctor;
import com.beordie.model.Register;
import com.beordie.service.IDoctorService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description 医生控制器
 * @Date 2021/7/30 17:56
 * @Created 30500
 */
@Controller
@ResponseBody
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    private IDoctorService doctorServiceImpl;

    /**
     * @description 多条件分页模糊查询
     * @author 30500
     * @date 2021/7/30 18:53
     * @type [java.lang.Integer 页码, java.lang.Integer 条数, com.beordie.bean.DoctorBean 查询条件]
     * @return com.beordie.bean.Message<com.beordie.model.Doctor> 查询的分页结果集
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public Message<Doctor> queryByPage(Integer pageNum, Integer pageSize, DoctorBean doctorBean) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 5;
        }
        PageInfo<Doctor> pageInfo = doctorServiceImpl.selectByLimit(pageNum, pageSize, doctorBean);
        return new Message<Doctor>(pageInfo);
    }

    /**
     * @description 根据主键进行信息查询
     * @author 30500
     * @date 2021/7/30 18:57
     * @type [int 主键ID]
     * @return com.beordie.bean.Message<com.beordie.model.Doctor>
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Message<Doctor> selectById(@PathVariable("id") int id) {
        Doctor doctor = doctorServiceImpl.selectById(id);
        Message<Doctor> message = new Message<>();
        if (doctor != null) {
            message.setObj(doctor);
        } else {
            message.setMsg("查询失败");
            message.setCode(500);
        }
        return message;
    }

    /**
     * @description 新增一条数据
     * @author 30500
     * @date 2021/7/30 19:10
     * @type [com.beordie.model.Doctor 插入的数据对象]
     * @return com.beordie.bean.Message<com.beordie.model.Doctor>
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Message<Doctor> add(Doctor doctor) {
        int add = doctorServiceImpl.add(doctor);
        Message<Doctor> message = new Message<>();
        if (add > 0) {
            message.setMsg("新增成功");
        } else {
            message.setMsg("新增失败");
            message.setCode(500);
        }
        return message;
    }
}
