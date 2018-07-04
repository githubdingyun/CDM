package com.cdm.model;

import java.util.ArrayList;
import java.util.List;

public class WarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseExample() {
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

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
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

        public Criteria andWarehouseAreaIsNull() {
            addCriterion("warehouse_area is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaIsNotNull() {
            addCriterion("warehouse_area is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaEqualTo(Float value) {
            addCriterion("warehouse_area =", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaNotEqualTo(Float value) {
            addCriterion("warehouse_area <>", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaGreaterThan(Float value) {
            addCriterion("warehouse_area >", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("warehouse_area >=", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaLessThan(Float value) {
            addCriterion("warehouse_area <", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaLessThanOrEqualTo(Float value) {
            addCriterion("warehouse_area <=", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaIn(List<Float> values) {
            addCriterion("warehouse_area in", values, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaNotIn(List<Float> values) {
            addCriterion("warehouse_area not in", values, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaBetween(Float value1, Float value2) {
            addCriterion("warehouse_area between", value1, value2, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaNotBetween(Float value1, Float value2) {
            addCriterion("warehouse_area not between", value1, value2, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneIsNull() {
            addCriterion("warehouse_phone is null");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneIsNotNull() {
            addCriterion("warehouse_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneEqualTo(String value) {
            addCriterion("warehouse_phone =", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneNotEqualTo(String value) {
            addCriterion("warehouse_phone <>", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneGreaterThan(String value) {
            addCriterion("warehouse_phone >", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_phone >=", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneLessThan(String value) {
            addCriterion("warehouse_phone <", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneLessThanOrEqualTo(String value) {
            addCriterion("warehouse_phone <=", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneLike(String value) {
            addCriterion("warehouse_phone like", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneNotLike(String value) {
            addCriterion("warehouse_phone not like", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneIn(List<String> values) {
            addCriterion("warehouse_phone in", values, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneNotIn(List<String> values) {
            addCriterion("warehouse_phone not in", values, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneBetween(String value1, String value2) {
            addCriterion("warehouse_phone between", value1, value2, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneNotBetween(String value1, String value2) {
            addCriterion("warehouse_phone not between", value1, value2, "warehousePhone");
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