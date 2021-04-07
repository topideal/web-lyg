package com.misnz.lyc.model;

import java.util.ArrayList;
import java.util.List;

public class RecruitCategoryEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitCategoryEntityExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleCnIsNull() {
            addCriterion("title_cn is null");
            return (Criteria) this;
        }

        public Criteria andTitleCnIsNotNull() {
            addCriterion("title_cn is not null");
            return (Criteria) this;
        }

        public Criteria andTitleCnEqualTo(String value) {
            addCriterion("title_cn =", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotEqualTo(String value) {
            addCriterion("title_cn <>", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnGreaterThan(String value) {
            addCriterion("title_cn >", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnGreaterThanOrEqualTo(String value) {
            addCriterion("title_cn >=", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnLessThan(String value) {
            addCriterion("title_cn <", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnLessThanOrEqualTo(String value) {
            addCriterion("title_cn <=", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnLike(String value) {
            addCriterion("title_cn like", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotLike(String value) {
            addCriterion("title_cn not like", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnIn(List<String> values) {
            addCriterion("title_cn in", values, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotIn(List<String> values) {
            addCriterion("title_cn not in", values, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnBetween(String value1, String value2) {
            addCriterion("title_cn between", value1, value2, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotBetween(String value1, String value2) {
            addCriterion("title_cn not between", value1, value2, "titleCn");
            return (Criteria) this;
        }

        public Criteria andDelTagIsNull() {
            addCriterion("del_tag is null");
            return (Criteria) this;
        }

        public Criteria andDelTagIsNotNull() {
            addCriterion("del_tag is not null");
            return (Criteria) this;
        }

        public Criteria andDelTagEqualTo(Integer value) {
            addCriterion("del_tag =", value, "delTag");
            return (Criteria) this;
        }

        public Criteria andDelTagNotEqualTo(Integer value) {
            addCriterion("del_tag <>", value, "delTag");
            return (Criteria) this;
        }

        public Criteria andDelTagGreaterThan(Integer value) {
            addCriterion("del_tag >", value, "delTag");
            return (Criteria) this;
        }

        public Criteria andDelTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_tag >=", value, "delTag");
            return (Criteria) this;
        }

        public Criteria andDelTagLessThan(Integer value) {
            addCriterion("del_tag <", value, "delTag");
            return (Criteria) this;
        }

        public Criteria andDelTagLessThanOrEqualTo(Integer value) {
            addCriterion("del_tag <=", value, "delTag");
            return (Criteria) this;
        }

        public Criteria andDelTagIn(List<Integer> values) {
            addCriterion("del_tag in", values, "delTag");
            return (Criteria) this;
        }

        public Criteria andDelTagNotIn(List<Integer> values) {
            addCriterion("del_tag not in", values, "delTag");
            return (Criteria) this;
        }

        public Criteria andDelTagBetween(Integer value1, Integer value2) {
            addCriterion("del_tag between", value1, value2, "delTag");
            return (Criteria) this;
        }

        public Criteria andDelTagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_tag not between", value1, value2, "delTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagIsNull() {
            addCriterion("order_tag is null");
            return (Criteria) this;
        }

        public Criteria andOrderTagIsNotNull() {
            addCriterion("order_tag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTagEqualTo(Integer value) {
            addCriterion("order_tag =", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagNotEqualTo(Integer value) {
            addCriterion("order_tag <>", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagGreaterThan(Integer value) {
            addCriterion("order_tag >", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_tag >=", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagLessThan(Integer value) {
            addCriterion("order_tag <", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagLessThanOrEqualTo(Integer value) {
            addCriterion("order_tag <=", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagIn(List<Integer> values) {
            addCriterion("order_tag in", values, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagNotIn(List<Integer> values) {
            addCriterion("order_tag not in", values, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagBetween(Integer value1, Integer value2) {
            addCriterion("order_tag between", value1, value2, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagNotBetween(Integer value1, Integer value2) {
            addCriterion("order_tag not between", value1, value2, "orderTag");
            return (Criteria) this;
        }

        public Criteria andTitleEnIsNull() {
            addCriterion("title_en is null");
            return (Criteria) this;
        }

        public Criteria andTitleEnIsNotNull() {
            addCriterion("title_en is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEnEqualTo(String value) {
            addCriterion("title_en =", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotEqualTo(String value) {
            addCriterion("title_en <>", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnGreaterThan(String value) {
            addCriterion("title_en >", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("title_en >=", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLessThan(String value) {
            addCriterion("title_en <", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLessThanOrEqualTo(String value) {
            addCriterion("title_en <=", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLike(String value) {
            addCriterion("title_en like", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotLike(String value) {
            addCriterion("title_en not like", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnIn(List<String> values) {
            addCriterion("title_en in", values, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotIn(List<String> values) {
            addCriterion("title_en not in", values, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnBetween(String value1, String value2) {
            addCriterion("title_en between", value1, value2, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotBetween(String value1, String value2) {
            addCriterion("title_en not between", value1, value2, "titleEn");
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