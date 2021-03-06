package com.cdm.model;

import java.util.ArrayList;
import java.util.List;

public class WorkerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkerExample() {
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

        public Criteria andWorkerIdIsNull() {
            addCriterion("worker_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNotNull() {
            addCriterion("worker_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdEqualTo(Integer value) {
            addCriterion("worker_id =", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotEqualTo(Integer value) {
            addCriterion("worker_id <>", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThan(Integer value) {
            addCriterion("worker_id >", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("worker_id >=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThan(Integer value) {
            addCriterion("worker_id <", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThanOrEqualTo(Integer value) {
            addCriterion("worker_id <=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIn(List<Integer> values) {
            addCriterion("worker_id in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotIn(List<Integer> values) {
            addCriterion("worker_id not in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdBetween(Integer value1, Integer value2) {
            addCriterion("worker_id between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("worker_id not between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNull() {
            addCriterion("worker_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNotNull() {
            addCriterion("worker_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameEqualTo(String value) {
            addCriterion("worker_name =", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotEqualTo(String value) {
            addCriterion("worker_name <>", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThan(String value) {
            addCriterion("worker_name >", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThanOrEqualTo(String value) {
            addCriterion("worker_name >=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThan(String value) {
            addCriterion("worker_name <", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThanOrEqualTo(String value) {
            addCriterion("worker_name <=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLike(String value) {
            addCriterion("worker_name like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotLike(String value) {
            addCriterion("worker_name not like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIn(List<String> values) {
            addCriterion("worker_name in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotIn(List<String> values) {
            addCriterion("worker_name not in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameBetween(String value1, String value2) {
            addCriterion("worker_name between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotBetween(String value1, String value2) {
            addCriterion("worker_name not between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordIsNull() {
            addCriterion("worker_password is null");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordIsNotNull() {
            addCriterion("worker_password is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordEqualTo(String value) {
            addCriterion("worker_password =", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordNotEqualTo(String value) {
            addCriterion("worker_password <>", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordGreaterThan(String value) {
            addCriterion("worker_password >", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("worker_password >=", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordLessThan(String value) {
            addCriterion("worker_password <", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordLessThanOrEqualTo(String value) {
            addCriterion("worker_password <=", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordLike(String value) {
            addCriterion("worker_password like", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordNotLike(String value) {
            addCriterion("worker_password not like", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordIn(List<String> values) {
            addCriterion("worker_password in", values, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordNotIn(List<String> values) {
            addCriterion("worker_password not in", values, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordBetween(String value1, String value2) {
            addCriterion("worker_password between", value1, value2, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordNotBetween(String value1, String value2) {
            addCriterion("worker_password not between", value1, value2, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderIsNull() {
            addCriterion("worker_leader is null");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderIsNotNull() {
            addCriterion("worker_leader is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderEqualTo(Integer value) {
            addCriterion("worker_leader =", value, "workerLeader");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderNotEqualTo(Integer value) {
            addCriterion("worker_leader <>", value, "workerLeader");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderGreaterThan(Integer value) {
            addCriterion("worker_leader >", value, "workerLeader");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("worker_leader >=", value, "workerLeader");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderLessThan(Integer value) {
            addCriterion("worker_leader <", value, "workerLeader");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("worker_leader <=", value, "workerLeader");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderIn(List<Integer> values) {
            addCriterion("worker_leader in", values, "workerLeader");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderNotIn(List<Integer> values) {
            addCriterion("worker_leader not in", values, "workerLeader");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderBetween(Integer value1, Integer value2) {
            addCriterion("worker_leader between", value1, value2, "workerLeader");
            return (Criteria) this;
        }

        public Criteria andWorkerLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("worker_leader not between", value1, value2, "workerLeader");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeIsNull() {
            addCriterion("worker_age is null");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeIsNotNull() {
            addCriterion("worker_age is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeEqualTo(Integer value) {
            addCriterion("worker_age =", value, "workerAge");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeNotEqualTo(Integer value) {
            addCriterion("worker_age <>", value, "workerAge");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeGreaterThan(Integer value) {
            addCriterion("worker_age >", value, "workerAge");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("worker_age >=", value, "workerAge");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeLessThan(Integer value) {
            addCriterion("worker_age <", value, "workerAge");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeLessThanOrEqualTo(Integer value) {
            addCriterion("worker_age <=", value, "workerAge");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeIn(List<Integer> values) {
            addCriterion("worker_age in", values, "workerAge");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeNotIn(List<Integer> values) {
            addCriterion("worker_age not in", values, "workerAge");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeBetween(Integer value1, Integer value2) {
            addCriterion("worker_age between", value1, value2, "workerAge");
            return (Criteria) this;
        }

        public Criteria andWorkerAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("worker_age not between", value1, value2, "workerAge");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlIsNull() {
            addCriterion("worker_img_url is null");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlIsNotNull() {
            addCriterion("worker_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlEqualTo(String value) {
            addCriterion("worker_img_url =", value, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlNotEqualTo(String value) {
            addCriterion("worker_img_url <>", value, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlGreaterThan(String value) {
            addCriterion("worker_img_url >", value, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("worker_img_url >=", value, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlLessThan(String value) {
            addCriterion("worker_img_url <", value, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlLessThanOrEqualTo(String value) {
            addCriterion("worker_img_url <=", value, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlLike(String value) {
            addCriterion("worker_img_url like", value, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlNotLike(String value) {
            addCriterion("worker_img_url not like", value, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlIn(List<String> values) {
            addCriterion("worker_img_url in", values, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlNotIn(List<String> values) {
            addCriterion("worker_img_url not in", values, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlBetween(String value1, String value2) {
            addCriterion("worker_img_url between", value1, value2, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerImgUrlNotBetween(String value1, String value2) {
            addCriterion("worker_img_url not between", value1, value2, "workerImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailIsNull() {
            addCriterion("worker_email is null");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailIsNotNull() {
            addCriterion("worker_email is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailEqualTo(String value) {
            addCriterion("worker_email =", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailNotEqualTo(String value) {
            addCriterion("worker_email <>", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailGreaterThan(String value) {
            addCriterion("worker_email >", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("worker_email >=", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailLessThan(String value) {
            addCriterion("worker_email <", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailLessThanOrEqualTo(String value) {
            addCriterion("worker_email <=", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailLike(String value) {
            addCriterion("worker_email like", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailNotLike(String value) {
            addCriterion("worker_email not like", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailIn(List<String> values) {
            addCriterion("worker_email in", values, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailNotIn(List<String> values) {
            addCriterion("worker_email not in", values, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailBetween(String value1, String value2) {
            addCriterion("worker_email between", value1, value2, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailNotBetween(String value1, String value2) {
            addCriterion("worker_email not between", value1, value2, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneIsNull() {
            addCriterion("worker_phone is null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneIsNotNull() {
            addCriterion("worker_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneEqualTo(String value) {
            addCriterion("worker_phone =", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotEqualTo(String value) {
            addCriterion("worker_phone <>", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneGreaterThan(String value) {
            addCriterion("worker_phone >", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("worker_phone >=", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneLessThan(String value) {
            addCriterion("worker_phone <", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneLessThanOrEqualTo(String value) {
            addCriterion("worker_phone <=", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneLike(String value) {
            addCriterion("worker_phone like", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotLike(String value) {
            addCriterion("worker_phone not like", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneIn(List<String> values) {
            addCriterion("worker_phone in", values, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotIn(List<String> values) {
            addCriterion("worker_phone not in", values, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneBetween(String value1, String value2) {
            addCriterion("worker_phone between", value1, value2, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotBetween(String value1, String value2) {
            addCriterion("worker_phone not between", value1, value2, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressIsNull() {
            addCriterion("worker_address is null");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressIsNotNull() {
            addCriterion("worker_address is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressEqualTo(String value) {
            addCriterion("worker_address =", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressNotEqualTo(String value) {
            addCriterion("worker_address <>", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressGreaterThan(String value) {
            addCriterion("worker_address >", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("worker_address >=", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressLessThan(String value) {
            addCriterion("worker_address <", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressLessThanOrEqualTo(String value) {
            addCriterion("worker_address <=", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressLike(String value) {
            addCriterion("worker_address like", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressNotLike(String value) {
            addCriterion("worker_address not like", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressIn(List<String> values) {
            addCriterion("worker_address in", values, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressNotIn(List<String> values) {
            addCriterion("worker_address not in", values, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressBetween(String value1, String value2) {
            addCriterion("worker_address between", value1, value2, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressNotBetween(String value1, String value2) {
            addCriterion("worker_address not between", value1, value2, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerDescIsNull() {
            addCriterion("worker_desc is null");
            return (Criteria) this;
        }

        public Criteria andWorkerDescIsNotNull() {
            addCriterion("worker_desc is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerDescEqualTo(String value) {
            addCriterion("worker_desc =", value, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescNotEqualTo(String value) {
            addCriterion("worker_desc <>", value, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescGreaterThan(String value) {
            addCriterion("worker_desc >", value, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescGreaterThanOrEqualTo(String value) {
            addCriterion("worker_desc >=", value, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescLessThan(String value) {
            addCriterion("worker_desc <", value, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescLessThanOrEqualTo(String value) {
            addCriterion("worker_desc <=", value, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescLike(String value) {
            addCriterion("worker_desc like", value, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescNotLike(String value) {
            addCriterion("worker_desc not like", value, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescIn(List<String> values) {
            addCriterion("worker_desc in", values, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescNotIn(List<String> values) {
            addCriterion("worker_desc not in", values, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescBetween(String value1, String value2) {
            addCriterion("worker_desc between", value1, value2, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerDescNotBetween(String value1, String value2) {
            addCriterion("worker_desc not between", value1, value2, "workerDesc");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNull() {
            addCriterion("worker_sex is null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNotNull() {
            addCriterion("worker_sex is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexEqualTo(String value) {
            addCriterion("worker_sex =", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotEqualTo(String value) {
            addCriterion("worker_sex <>", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThan(String value) {
            addCriterion("worker_sex >", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThanOrEqualTo(String value) {
            addCriterion("worker_sex >=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThan(String value) {
            addCriterion("worker_sex <", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThanOrEqualTo(String value) {
            addCriterion("worker_sex <=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLike(String value) {
            addCriterion("worker_sex like", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotLike(String value) {
            addCriterion("worker_sex not like", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIn(List<String> values) {
            addCriterion("worker_sex in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotIn(List<String> values) {
            addCriterion("worker_sex not in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexBetween(String value1, String value2) {
            addCriterion("worker_sex between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotBetween(String value1, String value2) {
            addCriterion("worker_sex not between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyIsNull() {
            addCriterion("worker_money is null");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyIsNotNull() {
            addCriterion("worker_money is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyEqualTo(Double value) {
            addCriterion("worker_money =", value, "workerMoney");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyNotEqualTo(Double value) {
            addCriterion("worker_money <>", value, "workerMoney");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyGreaterThan(Double value) {
            addCriterion("worker_money >", value, "workerMoney");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("worker_money >=", value, "workerMoney");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyLessThan(Double value) {
            addCriterion("worker_money <", value, "workerMoney");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyLessThanOrEqualTo(Double value) {
            addCriterion("worker_money <=", value, "workerMoney");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyIn(List<Double> values) {
            addCriterion("worker_money in", values, "workerMoney");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyNotIn(List<Double> values) {
            addCriterion("worker_money not in", values, "workerMoney");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyBetween(Double value1, Double value2) {
            addCriterion("worker_money between", value1, value2, "workerMoney");
            return (Criteria) this;
        }

        public Criteria andWorkerMoneyNotBetween(Double value1, Double value2) {
            addCriterion("worker_money not between", value1, value2, "workerMoney");
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