package com.beordie.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Description
 * @Date 2021/7/29 9:51
 * @Created 30500
 */
public class RegisterBean {
    private Integer id;
    private String doctorName;
    private String department;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh-mm-ss")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh-mm-ss")
    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    @Override
    public String toString() {
        return "RegisterBean{" +
                "id=" + id +
                ", doctorName='" + doctorName + '\'' +
                ", department='" + department + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
