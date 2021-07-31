package com.beordie.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Doctor {
    private Integer id;
    private String idCar;
    private String phone;
    private String telphone;
    private Integer sex;
    @JsonFormat(pattern = "yyyy-MM-dd hh-mm-ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh-mm-ss")
    private Date birthday;
    private Integer age;
    private String email;
    private String department;
    private String education;
    private String Description;
    @JsonFormat(pattern = "yyyy-MM-dd hh-mm-ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh-mm-ss")
    private Date inTime;
    private Integer status;
    private String name;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description == null ? null : Description.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", idCar='" + idCar + '\'' +
                ", phone='" + phone + '\'' +
                ", telphone='" + telphone + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", education='" + education + '\'' +
                ", Description='" + Description + '\'' +
                ", inTime=" + inTime +
                ", status=" + status +
                ", name='" + name + '\'' +
                '}';
    }
}