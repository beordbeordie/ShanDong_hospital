package com.beordie.service;

import com.beordie.bean.RegisterBean;
import com.beordie.model.Doctor;
import com.beordie.model.Register;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 挂诊
 * @Date 2021/7/29 9:48
 * @Created 30500
 */
public interface IRegisterService {
    /**
     * @description 分页多条件模糊查询
     * @author 30500
     * @date 2021/7/29 19:49
     * @type [int 页码,
     * int 显示条数,
     * com.beordie.bean.RegisterBean 模糊查询条件]
     * @return com.github.pagehelper.PageInfo<com.beordie.model.Register>
     */
    public PageInfo<Register> selectByLimit(int pageNum, int pageSize, RegisterBean registerBean);

    /**
     * @description 根据主键ID进行信息的查询
     * @author 30500
     * @date 2021/7/29 22:05
     * @type [int 主键ID]
     * @return com.beordie.model.Register
     */
    public Register selectById(int id);

    /**
     * @description 添加一条数据
     * @author 30500
     * @date 2021/7/30 10:04
     * @type [com.beordie.model.Register 需要添加对象数据]
     * @return int 返回影响的数据库条数
     */
    public int addRegister(Register register);

    /**
     * @description 根据主键ID和相关的数据进行数据的更新
     * @author 30500
     * @date 2021/7/30 11:04
     * @type [com.beordie.model.Register 包含有主键ID和需要更新数据的对象]
     * @return int 数据库更新影响的条数
     */
    public int updateById(Register register);

    /**
     * @description 住院 出院 退号
     * @author 30500
     * @date 2021/7/30 11:31
     * @type [java.lang.String 操作的类型, int 主键ID]
     * @return int 返回跟影响的数据库的条数
     */
    public int operateById(String operate, int id);

    /**
     * @description 批量操作
     * @author 30500
     * @date 2021/7/30 15:10
     * @type [java.lang.String 操作的类型, int[] ID集合]
     * @return int 返回影响条数
     */
    public int operateByIds(String operate, int[] ids);
}
