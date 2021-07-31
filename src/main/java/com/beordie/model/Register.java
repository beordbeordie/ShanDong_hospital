package com.beordie.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Register {
    private Integer id;
    private String idCar;
    private String idMedical;
    private Double registerPrice;
    private String phone;
    private Integer selfPrice;
    private Integer sex;
    private Integer age;
    private String work;
    private Integer lookDoctor;
    private Integer idDoctor;
    private String remark;
    private Integer status;
    @JsonFormat(pattern = "yyyy-MM-dd hh-mm-ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh-mm-ss")
    private Date time;
    private String department;
    private String name;
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar == null ? null : idCar.trim();
    }

    public String getIdMedical() {
        return idMedical;
    }

    public void setIdMedical(String idMedical) {
        this.idMedical = idMedical == null ? null : idMedical.trim();
    }

    public Double getRegisterPrice() {
        return registerPrice;
    }

    public void setRegisterPrice(Double registerPrice) {
        this.registerPrice = registerPrice;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSelfPrice() {
        return selfPrice;
    }

    public void setSelfPrice(Integer selfPrice) {
        this.selfPrice = selfPrice;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    public Integer getLookDoctor() {
        return lookDoctor;
    }

    public void setLookDoctor(Integer lookDoctor) {
        this.lookDoctor = lookDoctor;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", idCar='" + idCar + '\'' +
                ", idMedical='" + idMedical + '\'' +
                ", registerPrice=" + registerPrice +
                ", phone='" + phone + '\'' +
                ", selfPrice=" + selfPrice +
                ", sex=" + sex +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", lookDoctor=" + lookDoctor +
                ", idDoctor=" + idDoctor +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                ", time=" + time +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", doctor=" + doctor +
                '}';
    }
}