package com.cdm.model;

import java.util.ArrayList;
import java.util.List;

public class ProjectMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectMaterialExample() {
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

        public Criteria andMaterialIdIsNull() {
            addCriterion("material_id is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIsNotNull() {
            addCriterion("material_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdEqualTo(Integer value) {
            addCriterion("material_id =", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotEqualTo(Integer value) {
            addCriterion("material_id <>", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThan(Integer value) {
            addCriterion("material_id >", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_id >=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThan(Integer value) {
            addCriterion("material_id <", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThanOrEqualTo(Integer value) {
            addCriterion("material_id <=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIn(List<Integer> values) {
            addCriterion("material_id in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotIn(List<Integer> values) {
            addCriterion("material_id not in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdBetween(Integer value1, Integer value2) {
            addCriterion("material_id between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("material_id not between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumIsNull() {
            addCriterion("project_material_num is null");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumIsNotNull() {
            addCriterion("project_material_num is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumEqualTo(Integer value) {
            addCriterion("project_material_num =", value, "projectMaterialNum");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumNotEqualTo(Integer value) {
            addCriterion("project_material_num <>", value, "projectMaterialNum");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumGreaterThan(Integer value) {
            addCriterion("project_material_num >", value, "projectMaterialNum");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_material_num >=", value, "projectMaterialNum");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumLessThan(Integer value) {
            addCriterion("project_material_num <", value, "projectMaterialNum");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumLessThanOrEqualTo(Integer value) {
            addCriterion("project_material_num <=", value, "projectMaterialNum");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumIn(List<Integer> values) {
            addCriterion("project_material_num in", values, "projectMaterialNum");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumNotIn(List<Integer> values) {
            addCriterion("project_material_num not in", values, "projectMaterialNum");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumBetween(Integer value1, Integer value2) {
            addCriterion("project_material_num between", value1, value2, "projectMaterialNum");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialNumNotBetween(Integer value1, Integer value2) {
            addCriterion("project_material_num not between", value1, value2, "projectMaterialNum");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescIsNull() {
            addCriterion("project_material_desc is null");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescIsNotNull() {
            addCriterion("project_material_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescEqualTo(String value) {
            addCriterion("project_material_desc =", value, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescNotEqualTo(String value) {
            addCriterion("project_material_desc <>", value, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescGreaterThan(String value) {
            addCriterion("project_material_desc >", value, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescGreaterThanOrEqualTo(String value) {
            addCriterion("project_material_desc >=", value, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescLessThan(String value) {
            addCriterion("project_material_desc <", value, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescLessThanOrEqualTo(String value) {
            addCriterion("project_material_desc <=", value, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescLike(String value) {
            addCriterion("project_material_desc like", value, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescNotLike(String value) {
            addCriterion("project_material_desc not like", value, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescIn(List<String> values) {
            addCriterion("project_material_desc in", values, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescNotIn(List<String> values) {
            addCriterion("project_material_desc not in", values, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescBetween(String value1, String value2) {
            addCriterion("project_material_desc between", value1, value2, "projectMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andProjectMaterialDescNotBetween(String value1, String value2) {
            addCriterion("project_material_desc not between", value1, value2, "projectMaterialDesc");
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