package com.cdm.model;

import java.util.ArrayList;
import java.util.List;

public class LocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LocationExample() {
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

        public Criteria andLocationAddressIsNull() {
            addCriterion("location_address is null");
            return (Criteria) this;
        }

        public Criteria andLocationAddressIsNotNull() {
            addCriterion("location_address is not null");
            return (Criteria) this;
        }

        public Criteria andLocationAddressEqualTo(String value) {
            addCriterion("location_address =", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressNotEqualTo(String value) {
            addCriterion("location_address <>", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressGreaterThan(String value) {
            addCriterion("location_address >", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("location_address >=", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressLessThan(String value) {
            addCriterion("location_address <", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressLessThanOrEqualTo(String value) {
            addCriterion("location_address <=", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressLike(String value) {
            addCriterion("location_address like", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressNotLike(String value) {
            addCriterion("location_address not like", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressIn(List<String> values) {
            addCriterion("location_address in", values, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressNotIn(List<String> values) {
            addCriterion("location_address not in", values, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressBetween(String value1, String value2) {
            addCriterion("location_address between", value1, value2, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressNotBetween(String value1, String value2) {
            addCriterion("location_address not between", value1, value2, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationCostIsNull() {
            addCriterion("location_cost is null");
            return (Criteria) this;
        }

        public Criteria andLocationCostIsNotNull() {
            addCriterion("location_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLocationCostEqualTo(Float value) {
            addCriterion("location_cost =", value, "locationCost");
            return (Criteria) this;
        }

        public Criteria andLocationCostNotEqualTo(Float value) {
            addCriterion("location_cost <>", value, "locationCost");
            return (Criteria) this;
        }

        public Criteria andLocationCostGreaterThan(Float value) {
            addCriterion("location_cost >", value, "locationCost");
            return (Criteria) this;
        }

        public Criteria andLocationCostGreaterThanOrEqualTo(Float value) {
            addCriterion("location_cost >=", value, "locationCost");
            return (Criteria) this;
        }

        public Criteria andLocationCostLessThan(Float value) {
            addCriterion("location_cost <", value, "locationCost");
            return (Criteria) this;
        }

        public Criteria andLocationCostLessThanOrEqualTo(Float value) {
            addCriterion("location_cost <=", value, "locationCost");
            return (Criteria) this;
        }

        public Criteria andLocationCostIn(List<Float> values) {
            addCriterion("location_cost in", values, "locationCost");
            return (Criteria) this;
        }

        public Criteria andLocationCostNotIn(List<Float> values) {
            addCriterion("location_cost not in", values, "locationCost");
            return (Criteria) this;
        }

        public Criteria andLocationCostBetween(Float value1, Float value2) {
            addCriterion("location_cost between", value1, value2, "locationCost");
            return (Criteria) this;
        }

        public Criteria andLocationCostNotBetween(Float value1, Float value2) {
            addCriterion("location_cost not between", value1, value2, "locationCost");
            return (Criteria) this;
        }

        public Criteria andLocationDescIsNull() {
            addCriterion("location_desc is null");
            return (Criteria) this;
        }

        public Criteria andLocationDescIsNotNull() {
            addCriterion("location_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLocationDescEqualTo(String value) {
            addCriterion("location_desc =", value, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescNotEqualTo(String value) {
            addCriterion("location_desc <>", value, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescGreaterThan(String value) {
            addCriterion("location_desc >", value, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescGreaterThanOrEqualTo(String value) {
            addCriterion("location_desc >=", value, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescLessThan(String value) {
            addCriterion("location_desc <", value, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescLessThanOrEqualTo(String value) {
            addCriterion("location_desc <=", value, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescLike(String value) {
            addCriterion("location_desc like", value, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescNotLike(String value) {
            addCriterion("location_desc not like", value, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescIn(List<String> values) {
            addCriterion("location_desc in", values, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescNotIn(List<String> values) {
            addCriterion("location_desc not in", values, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescBetween(String value1, String value2) {
            addCriterion("location_desc between", value1, value2, "locationDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescNotBetween(String value1, String value2) {
            addCriterion("location_desc not between", value1, value2, "locationDesc");
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