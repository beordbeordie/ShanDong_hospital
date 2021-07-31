package com.beordie.bean;

/**
 * @Description 医生的查询封装
 * @Date 2021/7/30 17:35
 * @Created 30500
 */
public class DoctorBean {
    private Integer id;
    private String name;
    private String department;

    @Override
    public String toString() {
        return "DoctorBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
