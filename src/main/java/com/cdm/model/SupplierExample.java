package com.cdm.model;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIsNull() {
            addCriterion("supplier_address is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIsNotNull() {
            addCriterion("supplier_address is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressEqualTo(String value) {
            addCriterion("supplier_address =", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotEqualTo(String value) {
            addCriterion("supplier_address <>", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressGreaterThan(String value) {
            addCriterion("supplier_address >", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_address >=", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLessThan(String value) {
            addCriterion("supplier_address <", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLessThanOrEqualTo(String value) {
            addCriterion("supplier_address <=", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLike(String value) {
            addCriterion("supplier_address like", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotLike(String value) {
            addCriterion("supplier_address not like", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIn(List<String> values) {
            addCriterion("supplier_address in", values, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotIn(List<String> values) {
            addCriterion("supplier_address not in", values, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressBetween(String value1, String value2) {
            addCriterion("supplier_address between", value1, value2, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotBetween(String value1, String value2) {
            addCriterion("supplier_address not between", value1, value2, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIsNull() {
            addCriterion("supplier_phone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIsNotNull() {
            addCriterion("supplier_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneEqualTo(String value) {
            addCriterion("supplier_phone =", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotEqualTo(String value) {
            addCriterion("supplier_phone <>", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneGreaterThan(String value) {
            addCriterion("supplier_phone >", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_phone >=", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLessThan(String value) {
            addCriterion("supplier_phone <", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLessThanOrEqualTo(String value) {
            addCriterion("supplier_phone <=", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLike(String value) {
            addCriterion("supplier_phone like", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotLike(String value) {
            addCriterion("supplier_phone not like", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIn(List<String> values) {
            addCriterion("supplier_phone in", values, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotIn(List<String> values) {
            addCriterion("supplier_phone not in", values, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneBetween(String value1, String value2) {
            addCriterion("supplier_phone between", value1, value2, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotBetween(String value1, String value2) {
            addCriterion("supplier_phone not between", value1, value2, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountIsNull() {
            addCriterion("supplier_account is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountIsNotNull() {
            addCriterion("supplier_account is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountEqualTo(String value) {
            addCriterion("supplier_account =", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountNotEqualTo(String value) {
            addCriterion("supplier_account <>", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountGreaterThan(String value) {
            addCriterion("supplier_account >", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_account >=", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountLessThan(String value) {
            addCriterion("supplier_account <", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountLessThanOrEqualTo(String value) {
            addCriterion("supplier_account <=", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountLike(String value) {
            addCriterion("supplier_account like", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountNotLike(String value) {
            addCriterion("supplier_account not like", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountIn(List<String> values) {
            addCriterion("supplier_account in", values, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountNotIn(List<String> values) {
            addCriterion("supplier_account not in", values, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountBetween(String value1, String value2) {
            addCriterion("supplier_account between", value1, value2, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountNotBetween(String value1, String value2) {
            addCriterion("supplier_account not between", value1, value2, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlIsNull() {
            addCriterion("supplier_img_url is null");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlIsNotNull() {
            addCriterion("supplier_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlEqualTo(String value) {
            addCriterion("supplier_img_url =", value, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlNotEqualTo(String value) {
            addCriterion("supplier_img_url <>", value, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlGreaterThan(String value) {
            addCriterion("supplier_img_url >", value, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_img_url >=", value, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlLessThan(String value) {
            addCriterion("supplier_img_url <", value, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlLessThanOrEqualTo(String value) {
            addCriterion("supplier_img_url <=", value, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlLike(String value) {
            addCriterion("supplier_img_url like", value, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlNotLike(String value) {
            addCriterion("supplier_img_url not like", value, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlIn(List<String> values) {
            addCriterion("supplier_img_url in", values, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlNotIn(List<String> values) {
            addCriterion("supplier_img_url not in", values, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlBetween(String value1, String value2) {
            addCriterion("supplier_img_url between", value1, value2, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierImgUrlNotBetween(String value1, String value2) {
            addCriterion("supplier_img_url not between", value1, value2, "supplierImgUrl");
            return (Criteria) this;
        }

        public Criteria andSupplierDescIsNull() {
            addCriterion("supplier_desc is null");
            return (Criteria) this;
        }

        public Criteria andSupplierDescIsNotNull() {
            addCriterion("supplier_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierDescEqualTo(String value) {
            addCriterion("supplier_desc =", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescNotEqualTo(String value) {
            addCriterion("supplier_desc <>", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescGreaterThan(String value) {
            addCriterion("supplier_desc >", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_desc >=", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescLessThan(String value) {
            addCriterion("supplier_desc <", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescLessThanOrEqualTo(String value) {
            addCriterion("supplier_desc <=", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescLike(String value) {
            addCriterion("supplier_desc like", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescNotLike(String value) {
            addCriterion("supplier_desc not like", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescIn(List<String> values) {
            addCriterion("supplier_desc in", values, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescNotIn(List<String> values) {
            addCriterion("supplier_desc not in", values, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescBetween(String value1, String value2) {
            addCriterion("supplier_desc between", value1, value2, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescNotBetween(String value1, String value2) {
            addCriterion("supplier_desc not between", value1, value2, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIsNull() {
            addCriterion("supplier_email is null");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIsNotNull() {
            addCriterion("supplier_email is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailEqualTo(String value) {
            addCriterion("supplier_email =", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotEqualTo(String value) {
            addCriterion("supplier_email <>", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailGreaterThan(String value) {
            addCriterion("supplier_email >", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_email >=", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLessThan(String value) {
            addCriterion("supplier_email <", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLessThanOrEqualTo(String value) {
            addCriterion("supplier_email <=", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLike(String value) {
            addCriterion("supplier_email like", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotLike(String value) {
            addCriterion("supplier_email not like", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIn(List<String> values) {
            addCriterion("supplier_email in", values, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotIn(List<String> values) {
            addCriterion("supplier_email not in", values, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailBetween(String value1, String value2) {
            addCriterion("supplier_email between", value1, value2, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotBetween(String value1, String value2) {
            addCriterion("supplier_email not between", value1, value2, "supplierEmail");
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