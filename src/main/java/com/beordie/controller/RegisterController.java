package com.beordie.controller;

import com.beordie.bean.Message;
import com.beordie.bean.RegisterBean;
import com.beordie.model.Doctor;
import com.beordie.model.Register;
import com.beordie.service.IDoctorService;
import com.beordie.service.IRegisterService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 挂号
 * @Date 2021/7/29 10:27
 * @Created 30500
 */
@Controller
@ResponseBody
@RequestMapping("register")
public class RegisterController {
    @Autowired
    private IRegisterService registerServiceImpl;
    @Autowired
    private IDoctorService doctorServiceImpl;

    /**
     * @description 分页多条件模糊查询
     * @author 30500
     * @date 2021/7/29 21:04
     * @type [java.lang.Integer 页码,
     * java.lang.Integer 显示条数,
     * com.beordie.bean.RegisterBean 模糊查询条件]
     * @return com.beordie.bean.Message<com.beordie.model.Register> 挂号信息集合
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public Message<Register> queryByPage(Integer pageNum, Integer pageSize, RegisterBean registerBean) {
        System.out.println(registerBean);
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 5;
        }
        PageInfo<Register> pageInfo = registerServiceImpl.selectByLimit(pageNum, pageSize, registerBean);

        return new Message<>(pageInfo);
    }

    /**
     * @description 查询所有医生的信息
     * @author 30500
     * @date 2021/7/29 21:06
     * @type []
     * @return com.beordie.bean.Message<com.beordie.model.Doctor> 医生信息集合
     */
    @RequestMapping(value = "doctors", method = RequestMethod.GET)
    public Message<Doctor> getAllDoctor(String department) {
        List<Doctor> doctorList = doctorServiceImpl.selectAllDoctor(department);
        Message<Doctor> message = new Message<>();
        if (doctorList != null) {
            message.setList(doctorList);
        } else {
            message.setCode(500);
            message.setMsg("查询失败");
        }

        return message;
    }

    /**
     * @description 删除一条记录
     * @author 30500
     * @date 2021/7/29 21:06
     * @type [int 主键ID]
     * @return com.beordie.bean.Message<com.beordie.model.Doctor> 结果通知
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public Message<Register> delete(@PathVariable("id") int id) {
        int operate = registerServiceImpl.operateById("退号", id);
        Message<Register> message = new Message<>();
        if (operate > 0) {
            message.setMsg("退号成功");
        } else {
            message.setCode(500);
            message.setMsg("退号失败");
        }
        return message;
    }

    /**
     * @description 更新一条数据
     * @author 30500
     * @date 2021/7/29 21:08
     * @type [int 主键ID,
     * com.beordie.model.Register 更新信息]
     * @return com.beordie.bean.Message<com.beordie.model.Doctor>
     */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Message<Register> update(@PathVariable("id") int id, Register register) {
        register.setId(id);
        int update = registerServiceImpl.updateById(register);
        Message<Register> message = new Message<>();
        if (update > 0) {
            message.setMsg("更新成功");
        } else {
            message.setMsg("更新失败");
            message.setCode(500);
        }
        return message;
    }

    /**
     * @description 添加一条数据
     * @author 30500
     * @date 2021/7/29 21:08
     * @type [com.beordie.model.Register 需要添加的数据信息]
     * @return com.beordie.bean.Message<com.beordie.model.Doctor>
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Message<Register> add(Register register) {
        int addRegister = registerServiceImpl.addRegister(register);
        Message<Register> message = new Message<>();
        if (addRegister > 0) {
            message.setMsg("添加成功");
        } else {
            message.setMsg("添加失败");
            message.setCode(500);
        }
        return message;
    }

    /**
     * @description 根据主键进行信息的查询
     * @author 30500
     * @date 2021/7/30 10:45
     * @type [int 主键ID]
     * @return com.beordie.bean.Message<com.beordie.model.Register> 查询到的结果对象
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Message<Register> selectById(@PathVariable("id") int id) {
        Register register = registerServiceImpl.selectById(id);
        Message<Register> message = new Message<>();
        if (register != null) {
            message.setObj(register);
        } else {
            message.setMsg("查询失败");
            message.setCode(500);
        }
        return message;
    }

    /**
     * @description 批量退号
     * @author 30500
     * @date 2021/7/30 15:18
     * @type [int[] 退号的ID集合]
     * @return com.beordie.bean.Message<com.beordie.model.Register> 返回退号结果
     */
    @RequestMapping(value = "deletes", method = RequestMethod.DELETE)
    public Message<Register> deletes(@RequestParam(value="ids[]") int[] ids) {
        int operate = registerServiceImpl.operateByIds("退号", ids);
        Message<Register> message = new Message<>();
        if (operate == ids.length) {
            message.setMsg("退号成功");
        } else {
            message.setCode(500);
            message.setMsg("退号失败");
        }
        return message;
    }
}
