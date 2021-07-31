package com.beordie.service.impl;

import com.beordie.bean.RegisterBean;
import com.beordie.mapper.DoctorMapper;
import com.beordie.mapper.RegisterMapper;
import com.beordie.model.Doctor;
import com.beordie.model.DoctorExample;
import com.beordie.model.Register;
import com.beordie.model.RegisterExample;
import com.beordie.service.IRegisterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Date 2021/7/29 10:04
 * @Created 30500
 */
@Service
public class RegisterServiceImpl implements IRegisterService {
    @Autowired
    private RegisterMapper registerMapper;
    @Autowired
    private DoctorMapper doctorMapper;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public PageInfo<Register> selectByLimit(int pageNum, int pageSize, RegisterBean registerBean) {
        // 查询医生的编号
        List<Integer> idList = null;
        if (registerBean.getDoctorName() != null && !"".equals(registerBean.getDoctorName().trim()))
            idList = doctorMapper.selectIdByName(registerBean.getDoctorName());
        // 多条件查询
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();

        if (registerBean.getId() != null)
            criteria.andIdEqualTo(registerBean.getId());
        if (idList != null && idList.size() > 0)
            criteria.andIdDoctorIn(idList);
        if (registerBean.getDepartment() != null && !"".equals(registerBean.getDepartment().trim()))
            criteria.andDepartmentLike('%' + registerBean.getDepartment() + '%');
        if (registerBean.getStartTime() != null)
            criteria.andTimeGreaterThanOrEqualTo(registerBean.getStartTime());
        if (registerBean.getEndTime() != null)
            criteria.andTimeLessThanOrEqualTo(registerBean.getEndTime());

        // 分页查询
        PageHelper.startPage(pageNum, pageSize);
        List<Register> registerList = registerMapper.selectByExample(registerExample);
        return new PageInfo<>(registerList);
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public Register selectById(int id) {
        Register register = registerMapper.selectByPrimaryKey(id);
        return register;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int addRegister(Register register) {
        int insert = registerMapper.insert(register);
        return insert;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int operateByIds(String operate, int[] ids) {
        int result = 0;
        for (int id : ids) {
            result += registerMapper.bounce(id);
        }
        return result;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int operateById(String operate, int id) {
        int result = 0;
        if ("退号".equals(operate))
            result = registerMapper.bounce(id);
        else if ("住院".equals(operate))
            result = registerMapper.beHospitalized(id);
        else if ("出院".equals(operate))
            result = registerMapper.discharged(id);
        return result;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int updateById(Register register) {
        int update = registerMapper.updateByPrimaryKeySelective(register);
        return update;
    }
}
