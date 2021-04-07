package com.misnz.lyc.model;

import java.util.ArrayList;
import java.util.List;

public class TLycYearsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLycYearsExample() {
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

        public Criteria andYearsCodeIsNull() {
            addCriterion("years_code is null");
            return (Criteria) this;
        }

        public Criteria andYearsCodeIsNotNull() {
            addCriterion("years_code is not null");
            return (Criteria) this;
        }

        public Criteria andYearsCodeEqualTo(String value) {
            addCriterion("years_code =", value, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeNotEqualTo(String value) {
            addCriterion("years_code <>", value, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeGreaterThan(String value) {
            addCriterion("years_code >", value, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("years_code >=", value, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeLessThan(String value) {
            addCriterion("years_code <", value, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeLessThanOrEqualTo(String value) {
            addCriterion("years_code <=", value, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeLike(String value) {
            addCriterion("years_code like", value, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeNotLike(String value) {
            addCriterion("years_code not like", value, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeIn(List<String> values) {
            addCriterion("years_code in", values, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeNotIn(List<String> values) {
            addCriterion("years_code not in", values, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeBetween(String value1, String value2) {
            addCriterion("years_code between", value1, value2, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andYearsCodeNotBetween(String value1, String value2) {
            addCriterion("years_code not between", value1, value2, "yearsCode");
            return (Criteria) this;
        }

        public Criteria andCaseCountIsNull() {
            addCriterion("case_count is null");
            return (Criteria) this;
        }

        public Criteria andCaseCountIsNotNull() {
            addCriterion("case_count is not null");
            return (Criteria) this;
        }

        public Criteria andCaseCountEqualTo(Integer value) {
            addCriterion("case_count =", value, "caseCount");
            return (Criteria) this;
        }

        public Criteria andCaseCountNotEqualTo(Integer value) {
            addCriterion("case_count <>", value, "caseCount");
            return (Criteria) this;
        }

        public Criteria andCaseCountGreaterThan(Integer value) {
            addCriterion("case_count >", value, "caseCount");
            return (Criteria) this;
        }

        public Criteria andCaseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_count >=", value, "caseCount");
            return (Criteria) this;
        }

        public Criteria andCaseCountLessThan(Integer value) {
            addCriterion("case_count <", value, "caseCount");
            return (Criteria) this;
        }

        public Criteria andCaseCountLessThanOrEqualTo(Integer value) {
            addCriterion("case_count <=", value, "caseCount");
            return (Criteria) this;
        }

        public Criteria andCaseCountIn(List<Integer> values) {
            addCriterion("case_count in", values, "caseCount");
            return (Criteria) this;
        }

        public Criteria andCaseCountNotIn(List<Integer> values) {
            addCriterion("case_count not in", values, "caseCount");
            return (Criteria) this;
        }

        public Criteria andCaseCountBetween(Integer value1, Integer value2) {
            addCriterion("case_count between", value1, value2, "caseCount");
            return (Criteria) this;
        }

        public Criteria andCaseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("case_count not between", value1, value2, "caseCount");
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