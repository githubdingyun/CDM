package com.cdm.model;

import java.util.ArrayList;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIsNull() {
            addCriterion("material_price is null");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIsNotNull() {
            addCriterion("material_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceEqualTo(Float value) {
            addCriterion("material_price =", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotEqualTo(Float value) {
            addCriterion("material_price <>", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceGreaterThan(Float value) {
            addCriterion("material_price >", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("material_price >=", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceLessThan(Float value) {
            addCriterion("material_price <", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceLessThanOrEqualTo(Float value) {
            addCriterion("material_price <=", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIn(List<Float> values) {
            addCriterion("material_price in", values, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotIn(List<Float> values) {
            addCriterion("material_price not in", values, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceBetween(Float value1, Float value2) {
            addCriterion("material_price between", value1, value2, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotBetween(Float value1, Float value2) {
            addCriterion("material_price not between", value1, value2, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeIsNull() {
            addCriterion("material_size is null");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeIsNotNull() {
            addCriterion("material_size is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeEqualTo(Float value) {
            addCriterion("material_size =", value, "materialSize");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeNotEqualTo(Float value) {
            addCriterion("material_size <>", value, "materialSize");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeGreaterThan(Float value) {
            addCriterion("material_size >", value, "materialSize");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeGreaterThanOrEqualTo(Float value) {
            addCriterion("material_size >=", value, "materialSize");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeLessThan(Float value) {
            addCriterion("material_size <", value, "materialSize");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeLessThanOrEqualTo(Float value) {
            addCriterion("material_size <=", value, "materialSize");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeIn(List<Float> values) {
            addCriterion("material_size in", values, "materialSize");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeNotIn(List<Float> values) {
            addCriterion("material_size not in", values, "materialSize");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeBetween(Float value1, Float value2) {
            addCriterion("material_size between", value1, value2, "materialSize");
            return (Criteria) this;
        }

        public Criteria andMaterialSizeNotBetween(Float value1, Float value2) {
            addCriterion("material_size not between", value1, value2, "materialSize");
            return (Criteria) this;
        }

        public Criteria andMaterialDescIsNull() {
            addCriterion("material_desc is null");
            return (Criteria) this;
        }

        public Criteria andMaterialDescIsNotNull() {
            addCriterion("material_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialDescEqualTo(String value) {
            addCriterion("material_desc =", value, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescNotEqualTo(String value) {
            addCriterion("material_desc <>", value, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescGreaterThan(String value) {
            addCriterion("material_desc >", value, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescGreaterThanOrEqualTo(String value) {
            addCriterion("material_desc >=", value, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescLessThan(String value) {
            addCriterion("material_desc <", value, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescLessThanOrEqualTo(String value) {
            addCriterion("material_desc <=", value, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescLike(String value) {
            addCriterion("material_desc like", value, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescNotLike(String value) {
            addCriterion("material_desc not like", value, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescIn(List<String> values) {
            addCriterion("material_desc in", values, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescNotIn(List<String> values) {
            addCriterion("material_desc not in", values, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescBetween(String value1, String value2) {
            addCriterion("material_desc between", value1, value2, "materialDesc");
            return (Criteria) this;
        }

        public Criteria andMaterialDescNotBetween(String value1, String value2) {
            addCriterion("material_desc not between", value1, value2, "materialDesc");
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