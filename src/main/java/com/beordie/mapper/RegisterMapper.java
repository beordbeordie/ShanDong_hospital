package com.beordie.mapper;

import com.beordie.model.Register;
import com.beordie.model.RegisterExample;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegisterMapper {
    long countByExample(RegisterExample example);

    int deleteByExample(RegisterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Register record);

    int insertSelective(Register record);

    List<Register> selectByExample(RegisterExample example);

    Register selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);

    int bounce(int id);

    int beHospitalized(int id);

    int discharged(int id);

    int bounces(int[] ids);

    int beHospitalizeds(int[] ids);

    int dischargeds(int[] ids);
}