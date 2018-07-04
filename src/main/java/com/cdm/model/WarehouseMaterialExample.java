package com.cdm.model;

import java.util.ArrayList;
import java.util.List;

public class WarehouseMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseMaterialExample() {
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

        public Criteria andWarehouseMaterialNumIsNull() {
            addCriterion("warehouse_material_num is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumIsNotNull() {
            addCriterion("warehouse_material_num is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumEqualTo(Integer value) {
            addCriterion("warehouse_material_num =", value, "warehouseMaterialNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumNotEqualTo(Integer value) {
            addCriterion("warehouse_material_num <>", value, "warehouseMaterialNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumGreaterThan(Integer value) {
            addCriterion("warehouse_material_num >", value, "warehouseMaterialNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_material_num >=", value, "warehouseMaterialNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumLessThan(Integer value) {
            addCriterion("warehouse_material_num <", value, "warehouseMaterialNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_material_num <=", value, "warehouseMaterialNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumIn(List<Integer> values) {
            addCriterion("warehouse_material_num in", values, "warehouseMaterialNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumNotIn(List<Integer> values) {
            addCriterion("warehouse_material_num not in", values, "warehouseMaterialNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_material_num between", value1, value2, "warehouseMaterialNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialNumNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_material_num not between", value1, value2, "warehouseMaterialNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescIsNull() {
            addCriterion("warehouse_material_desc is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescIsNotNull() {
            addCriterion("warehouse_material_desc is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescEqualTo(String value) {
            addCriterion("warehouse_material_desc =", value, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescNotEqualTo(String value) {
            addCriterion("warehouse_material_desc <>", value, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescGreaterThan(String value) {
            addCriterion("warehouse_material_desc >", value, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_material_desc >=", value, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescLessThan(String value) {
            addCriterion("warehouse_material_desc <", value, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescLessThanOrEqualTo(String value) {
            addCriterion("warehouse_material_desc <=", value, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescLike(String value) {
            addCriterion("warehouse_material_desc like", value, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescNotLike(String value) {
            addCriterion("warehouse_material_desc not like", value, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescIn(List<String> values) {
            addCriterion("warehouse_material_desc in", values, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescNotIn(List<String> values) {
            addCriterion("warehouse_material_desc not in", values, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescBetween(String value1, String value2) {
            addCriterion("warehouse_material_desc between", value1, value2, "warehouseMaterialDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseMaterialDescNotBetween(String value1, String value2) {
            addCriterion("warehouse_material_desc not between", value1, value2, "warehouseMaterialDesc");
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