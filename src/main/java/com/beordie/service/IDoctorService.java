package com.beordie.service;

import com.beordie.bean.DoctorBean;
import com.beordie.bean.RegisterBean;
import com.beordie.model.Doctor;
import com.beordie.model.Register;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Description 医生
 * @Date 2021/7/29 19:48
 * @Created 30500
 */
public interface IDoctorService {
    public PageInfo<Doctor> selectByLimit(int pageNum, int pageSize, DoctorBean doctorBean);

    /**
     * @description 根据姓名模糊查询所有医生ID信息
     * @author 30500
     * @date 2021/7/29 20:01
     * @type [java.lang.String 医生的姓名]
     * @return java.util.List<java.lang.Integer> 查询的ID集合
     */
    public List<Integer> selectIdByName(String name);

    /**
     * @description 查询所有医生的信息
     * @author 30500
     * @date 2021/7/29 20:54
     * @type []
     * @return java.util.List<com.beordie.model.Doctor> 医生信息集合
     */
    public List<Doctor> selectAllDoctor();

    /**
     * @description 根据科室查询医生信息
     * @author 30500
     * @date 2021/7/30 9:37
     * @type [java.lang.String 所属科室]
     * @return java.util.List<com.beordie.model.Doctor>
     */
    public List<Doctor> selectAllDoctor(String department);

    /**
     * @description 根据主键进行信息查询
     * @author 30500
     * @date 2021/7/30 18:56
     * @type [int 主键ID]
     * @return com.beordie.model.Doctor 查询结果
     */
    public Doctor selectById(int id);

    /**
     * @description 插入一条数据
     * @author 30500
     * @date 2021/7/30 19:07
     * @type [com.beordie.model.Doctor 插入的数据对象]
     * @return int 返回影响的数据库条数
     */
    public int add(Doctor doctor);
}
