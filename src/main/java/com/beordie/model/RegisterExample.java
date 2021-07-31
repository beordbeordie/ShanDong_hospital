package com.beordie.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegisterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdCarIsNull() {
            addCriterion("id_car is null");
            return (Criteria) this;
        }

        public Criteria andIdCarIsNotNull() {
            addCriterion("id_car is not null");
            return (Criteria) this;
        }

        public Criteria andIdCarEqualTo(String value) {
            addCriterion("id_car =", value, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarNotEqualTo(String value) {
            addCriterion("id_car <>", value, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarGreaterThan(String value) {
            addCriterion("id_car >", value, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarGreaterThanOrEqualTo(String value) {
            addCriterion("id_car >=", value, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarLessThan(String value) {
            addCriterion("id_car <", value, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarLessThanOrEqualTo(String value) {
            addCriterion("id_car <=", value, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarLike(String value) {
            addCriterion("id_car like", value, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarNotLike(String value) {
            addCriterion("id_car not like", value, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarIn(List<String> values) {
            addCriterion("id_car in", values, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarNotIn(List<String> values) {
            addCriterion("id_car not in", values, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarBetween(String value1, String value2) {
            addCriterion("id_car between", value1, value2, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdCarNotBetween(String value1, String value2) {
            addCriterion("id_car not between", value1, value2, "idCar");
            return (Criteria) this;
        }

        public Criteria andIdMedicalIsNull() {
            addCriterion("id_medical is null");
            return (Criteria) this;
        }

        public Criteria andIdMedicalIsNotNull() {
            addCriterion("id_medical is not null");
            return (Criteria) this;
        }

        public Criteria andIdMedicalEqualTo(String value) {
            addCriterion("id_medical =", value, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalNotEqualTo(String value) {
            addCriterion("id_medical <>", value, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalGreaterThan(String value) {
            addCriterion("id_medical >", value, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalGreaterThanOrEqualTo(String value) {
            addCriterion("id_medical >=", value, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalLessThan(String value) {
            addCriterion("id_medical <", value, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalLessThanOrEqualTo(String value) {
            addCriterion("id_medical <=", value, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalLike(String value) {
            addCriterion("id_medical like", value, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalNotLike(String value) {
            addCriterion("id_medical not like", value, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalIn(List<String> values) {
            addCriterion("id_medical in", values, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalNotIn(List<String> values) {
            addCriterion("id_medical not in", values, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalBetween(String value1, String value2) {
            addCriterion("id_medical between", value1, value2, "idMedical");
            return (Criteria) this;
        }

        public Criteria andIdMedicalNotBetween(String value1, String value2) {
            addCriterion("id_medical not between", value1, value2, "idMedical");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceIsNull() {
            addCriterion("register_price is null");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceIsNotNull() {
            addCriterion("register_price is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceEqualTo(Double value) {
            addCriterion("register_price =", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceNotEqualTo(Double value) {
            addCriterion("register_price <>", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceGreaterThan(Double value) {
            addCriterion("register_price >", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("register_price >=", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceLessThan(Double value) {
            addCriterion("register_price <", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceLessThanOrEqualTo(Double value) {
            addCriterion("register_price <=", value, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceIn(List<Double> values) {
            addCriterion("register_price in", values, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceNotIn(List<Double> values) {
            addCriterion("register_price not in", values, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceBetween(Double value1, Double value2) {
            addCriterion("register_price between", value1, value2, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andRegisterPriceNotBetween(Double value1, Double value2) {
            addCriterion("register_price not between", value1, value2, "registerPrice");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSelfPriceIsNull() {
            addCriterion("self_price is null");
            return (Criteria) this;
        }

        public Criteria andSelfPriceIsNotNull() {
            addCriterion("self_price is not null");
            return (Criteria) this;
        }

        public Criteria andSelfPriceEqualTo(Integer value) {
            addCriterion("self_price =", value, "selfPrice");
            return (Criteria) this;
        }

        public Criteria andSelfPriceNotEqualTo(Integer value) {
            addCriterion("self_price <>", value, "selfPrice");
            return (Criteria) this;
        }

        public Criteria andSelfPriceGreaterThan(Integer value) {
            addCriterion("self_price >", value, "selfPrice");
            return (Criteria) this;
        }

        public Criteria andSelfPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("self_price >=", value, "selfPrice");
            return (Criteria) this;
        }

        public Criteria andSelfPriceLessThan(Integer value) {
            addCriterion("self_price <", value, "selfPrice");
            return (Criteria) this;
        }

        public Criteria andSelfPriceLessThanOrEqualTo(Integer value) {
            addCriterion("self_price <=", value, "selfPrice");
            return (Criteria) this;
        }

        public Criteria andSelfPriceIn(List<Integer> values) {
            addCriterion("self_price in", values, "selfPrice");
            return (Criteria) this;
        }

        public Criteria andSelfPriceNotIn(List<Integer> values) {
            addCriterion("self_price not in", values, "selfPrice");
            return (Criteria) this;
        }

        public Criteria andSelfPriceBetween(Integer value1, Integer value2) {
            addCriterion("self_price between", value1, value2, "selfPrice");
            return (Criteria) this;
        }

        public Criteria andSelfPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("self_price not between", value1, value2, "selfPrice");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andWorkIsNull() {
            addCriterion("work is null");
            return (Criteria) this;
        }

        public Criteria andWorkIsNotNull() {
            addCriterion("work is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEqualTo(String value) {
            addCriterion("work =", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotEqualTo(String value) {
            addCriterion("work <>", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThan(String value) {
            addCriterion("work >", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThanOrEqualTo(String value) {
            addCriterion("work >=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThan(String value) {
            addCriterion("work <", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThanOrEqualTo(String value) {
            addCriterion("work <=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLike(String value) {
            addCriterion("work like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotLike(String value) {
            addCriterion("work not like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkIn(List<String> values) {
            addCriterion("work in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotIn(List<String> values) {
            addCriterion("work not in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkBetween(String value1, String value2) {
            addCriterion("work between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotBetween(String value1, String value2) {
            addCriterion("work not between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andLookDoctorIsNull() {
            addCriterion("look_doctor is null");
            return (Criteria) this;
        }

        public Criteria andLookDoctorIsNotNull() {
            addCriterion("look_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andLookDoctorEqualTo(Integer value) {
            addCriterion("look_doctor =", value, "lookDoctor");
            return (Criteria) this;
        }

        public Criteria andLookDoctorNotEqualTo(Integer value) {
            addCriterion("look_doctor <>", value, "lookDoctor");
            return (Criteria) this;
        }

        public Criteria andLookDoctorGreaterThan(Integer value) {
            addCriterion("look_doctor >", value, "lookDoctor");
            return (Criteria) this;
        }

        public Criteria andLookDoctorGreaterThanOrEqualTo(Integer value) {
            addCriterion("look_doctor >=", value, "lookDoctor");
            return (Criteria) this;
        }

        public Criteria andLookDoctorLessThan(Integer value) {
            addCriterion("look_doctor <", value, "lookDoctor");
            return (Criteria) this;
        }

        public Criteria andLookDoctorLessThanOrEqualTo(Integer value) {
            addCriterion("look_doctor <=", value, "lookDoctor");
            return (Criteria) this;
        }

        public Criteria andLookDoctorIn(List<Integer> values) {
            addCriterion("look_doctor in", values, "lookDoctor");
            return (Criteria) this;
        }

        public Criteria andLookDoctorNotIn(List<Integer> values) {
            addCriterion("look_doctor not in", values, "lookDoctor");
            return (Criteria) this;
        }

        public Criteria andLookDoctorBetween(Integer value1, Integer value2) {
            addCriterion("look_doctor between", value1, value2, "lookDoctor");
            return (Criteria) this;
        }

        public Criteria andLookDoctorNotBetween(Integer value1, Integer value2) {
            addCriterion("look_doctor not between", value1, value2, "lookDoctor");
            return (Criteria) this;
        }

        public Criteria andIdDoctorIsNull() {
            addCriterion("id_doctor is null");
            return (Criteria) this;
        }

        public Criteria andIdDoctorIsNotNull() {
            addCriterion("id_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andIdDoctorEqualTo(Integer value) {
            addCriterion("id_doctor =", value, "idDoctor");
            return (Criteria) this;
        }

        public Criteria andIdDoctorNotEqualTo(Integer value) {
            addCriterion("id_doctor <>", value, "idDoctor");
            return (Criteria) this;
        }

        public Criteria andIdDoctorGreaterThan(Integer value) {
            addCriterion("id_doctor >", value, "idDoctor");
            return (Criteria) this;
        }

        public Criteria andIdDoctorGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_doctor >=", value, "idDoctor");
            return (Criteria) this;
        }

        public Criteria andIdDoctorLessThan(Integer value) {
            addCriterion("id_doctor <", value, "idDoctor");
            return (Criteria) this;
        }

        public Criteria andIdDoctorLessThanOrEqualTo(Integer value) {
            addCriterion("id_doctor <=", value, "idDoctor");
            return (Criteria) this;
        }

        public Criteria andIdDoctorIn(List<Integer> values) {
            addCriterion("id_doctor in", values, "idDoctor");
            return (Criteria) this;
        }

        public Criteria andIdDoctorNotIn(List<Integer> values) {
            addCriterion("id_doctor not in", values, "idDoctor");
            return (Criteria) this;
        }

        public Criteria andIdDoctorBetween(Integer value1, Integer value2) {
            addCriterion("id_doctor between", value1, value2, "idDoctor");
            return (Criteria) this;
        }

        public Criteria andIdDoctorNotBetween(Integer value1, Integer value2) {
            addCriterion("id_doctor not between", value1, value2, "idDoctor");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}