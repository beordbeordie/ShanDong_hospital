package com.beordie.service.impl;

import com.beordie.bean.DoctorBean;
import com.beordie.bean.RegisterBean;
import com.beordie.mapper.DoctorMapper;
import com.beordie.model.Doctor;
import com.beordie.model.DoctorExample;
import com.beordie.model.Register;
import com.beordie.service.IDoctorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description
 * @Date 2021/7/29 19:49
 * @Created 30500
 */
@Service
public class DoctorServiceImpl implements IDoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public PageInfo<Doctor> selectByLimit(int pageNum, int pageSize, DoctorBean doctorBean) {
        DoctorExample example = new DoctorExample();
        DoctorExample.Criteria criteria = example.createCriteria();

        if (doctorBean.getId() != null)
            criteria.andIdEqualTo(doctorBean.getId());
        if (doctorBean.getName() != null && !"".equals(doctorBean.getName().trim()))
            criteria.andNameLike("%" + doctorBean.getName() + "%");
        if (doctorBean.getDepartment() != null && !"".equals(doctorBean.getDepartment().trim()))
            criteria.andDepartmentLike(doctorBean.getDepartment());

        PageHelper.startPage(pageNum, pageSize);
        List<Doctor> registerList = doctorMapper.selectByExample(example);
        return new PageInfo<>(registerList);
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public List<Doctor> selectAllDoctor() {
        DoctorExample example = new DoctorExample();
        List<Doctor> doctorList = doctorMapper.selectByExample(example);
        return doctorList;
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public List<Integer> selectIdByName(String name) {
        List<Integer> idList = doctorMapper.selectIdByName(name);
        return idList;
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public List<Doctor> selectAllDoctor(String department) {
        DoctorExample example = new DoctorExample();
        DoctorExample.Criteria criteria = example.createCriteria();
        criteria.andDepartmentEqualTo(department);

        List<Doctor> doctorList = doctorMapper.selectByExample(example);
        return doctorList;
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public Doctor selectById(int id) {
        return doctorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Doctor doctor) {
        return doctorMapper.insert(doctor);
    }
}
