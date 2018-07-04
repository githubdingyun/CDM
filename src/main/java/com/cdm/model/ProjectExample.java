package com.cdm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
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

        public Criteria andLocationIdIsNull() {
            addCriterion("location_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNotNull() {
            addCriterion("location_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdEqualTo(Integer value) {
            addCriterion("location_id =", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotEqualTo(Integer value) {
            addCriterion("location_id <>", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThan(Integer value) {
            addCriterion("location_id >", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_id >=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThan(Integer value) {
            addCriterion("location_id <", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("location_id <=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIn(List<Integer> values) {
            addCriterion("location_id in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotIn(List<Integer> values) {
            addCriterion("location_id not in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("location_id between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("location_id not between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andProjectTitleIsNull() {
            addCriterion("project_title is null");
            return (Criteria) this;
        }

        public Criteria andProjectTitleIsNotNull() {
            addCriterion("project_title is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTitleEqualTo(String value) {
            addCriterion("project_title =", value, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleNotEqualTo(String value) {
            addCriterion("project_title <>", value, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleGreaterThan(String value) {
            addCriterion("project_title >", value, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleGreaterThanOrEqualTo(String value) {
            addCriterion("project_title >=", value, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleLessThan(String value) {
            addCriterion("project_title <", value, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleLessThanOrEqualTo(String value) {
            addCriterion("project_title <=", value, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleLike(String value) {
            addCriterion("project_title like", value, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleNotLike(String value) {
            addCriterion("project_title not like", value, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleIn(List<String> values) {
            addCriterion("project_title in", values, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleNotIn(List<String> values) {
            addCriterion("project_title not in", values, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleBetween(String value1, String value2) {
            addCriterion("project_title between", value1, value2, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectTitleNotBetween(String value1, String value2) {
            addCriterion("project_title not between", value1, value2, "projectTitle");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetIsNull() {
            addCriterion("project_budget is null");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetIsNotNull() {
            addCriterion("project_budget is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetEqualTo(Float value) {
            addCriterion("project_budget =", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetNotEqualTo(Float value) {
            addCriterion("project_budget <>", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetGreaterThan(Float value) {
            addCriterion("project_budget >", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetGreaterThanOrEqualTo(Float value) {
            addCriterion("project_budget >=", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetLessThan(Float value) {
            addCriterion("project_budget <", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetLessThanOrEqualTo(Float value) {
            addCriterion("project_budget <=", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetIn(List<Float> values) {
            addCriterion("project_budget in", values, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetNotIn(List<Float> values) {
            addCriterion("project_budget not in", values, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetBetween(Float value1, Float value2) {
            addCriterion("project_budget between", value1, value2, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetNotBetween(Float value1, Float value2) {
            addCriterion("project_budget not between", value1, value2, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIsNull() {
            addCriterion("project_start_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIsNotNull() {
            addCriterion("project_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateEqualTo(Date value) {
            addCriterion("project_start_date =", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotEqualTo(Date value) {
            addCriterion("project_start_date <>", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThan(Date value) {
            addCriterion("project_start_date >", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("project_start_date >=", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThan(Date value) {
            addCriterion("project_start_date <", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThanOrEqualTo(Date value) {
            addCriterion("project_start_date <=", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIn(List<Date> values) {
            addCriterion("project_start_date in", values, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotIn(List<Date> values) {
            addCriterion("project_start_date not in", values, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateBetween(Date value1, Date value2) {
            addCriterion("project_start_date between", value1, value2, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotBetween(Date value1, Date value2) {
            addCriterion("project_start_date not between", value1, value2, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateIsNull() {
            addCriterion("project_end_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateIsNotNull() {
            addCriterion("project_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateEqualTo(Date value) {
            addCriterion("project_end_date =", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotEqualTo(Date value) {
            addCriterion("project_end_date <>", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThan(Date value) {
            addCriterion("project_end_date >", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("project_end_date >=", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThan(Date value) {
            addCriterion("project_end_date <", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateLessThanOrEqualTo(Date value) {
            addCriterion("project_end_date <=", value, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateIn(List<Date> values) {
            addCriterion("project_end_date in", values, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotIn(List<Date> values) {
            addCriterion("project_end_date not in", values, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateBetween(Date value1, Date value2) {
            addCriterion("project_end_date between", value1, value2, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectEndDateNotBetween(Date value1, Date value2) {
            addCriterion("project_end_date not between", value1, value2, "projectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectDescIsNull() {
            addCriterion("project_desc is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescIsNotNull() {
            addCriterion("project_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescEqualTo(String value) {
            addCriterion("project_desc =", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotEqualTo(String value) {
            addCriterion("project_desc <>", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescGreaterThan(String value) {
            addCriterion("project_desc >", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescGreaterThanOrEqualTo(String value) {
            addCriterion("project_desc >=", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLessThan(String value) {
            addCriterion("project_desc <", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLessThanOrEqualTo(String value) {
            addCriterion("project_desc <=", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLike(String value) {
            addCriterion("project_desc like", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotLike(String value) {
            addCriterion("project_desc not like", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescIn(List<String> values) {
            addCriterion("project_desc in", values, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotIn(List<String> values) {
            addCriterion("project_desc not in", values, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescBetween(String value1, String value2) {
            addCriterion("project_desc between", value1, value2, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotBetween(String value1, String value2) {
            addCriterion("project_desc not between", value1, value2, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlIsNull() {
            addCriterion("project_base_url is null");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlIsNotNull() {
            addCriterion("project_base_url is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlEqualTo(String value) {
            addCriterion("project_base_url =", value, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlNotEqualTo(String value) {
            addCriterion("project_base_url <>", value, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlGreaterThan(String value) {
            addCriterion("project_base_url >", value, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("project_base_url >=", value, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlLessThan(String value) {
            addCriterion("project_base_url <", value, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlLessThanOrEqualTo(String value) {
            addCriterion("project_base_url <=", value, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlLike(String value) {
            addCriterion("project_base_url like", value, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlNotLike(String value) {
            addCriterion("project_base_url not like", value, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlIn(List<String> values) {
            addCriterion("project_base_url in", values, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlNotIn(List<String> values) {
            addCriterion("project_base_url not in", values, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlBetween(String value1, String value2) {
            addCriterion("project_base_url between", value1, value2, "projectBaseUrl");
            return (Criteria) this;
        }

        public Criteria andProjectBaseUrlNotBetween(String value1, String value2) {
            addCriterion("project_base_url not between", value1, value2, "projectBaseUrl");
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