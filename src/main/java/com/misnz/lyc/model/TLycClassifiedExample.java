package com.misnz.lyc.model;

import java.util.ArrayList;
import java.util.List;

public class TLycClassifiedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLycClassifiedExample() {
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

        public Criteria andClassifiedIdIsNull() {
            addCriterion("classified_id is null");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdIsNotNull() {
            addCriterion("classified_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdEqualTo(String value) {
            addCriterion("classified_id =", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdNotEqualTo(String value) {
            addCriterion("classified_id <>", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdGreaterThan(String value) {
            addCriterion("classified_id >", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdGreaterThanOrEqualTo(String value) {
            addCriterion("classified_id >=", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdLessThan(String value) {
            addCriterion("classified_id <", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdLessThanOrEqualTo(String value) {
            addCriterion("classified_id <=", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdLike(String value) {
            addCriterion("classified_id like", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdNotLike(String value) {
            addCriterion("classified_id not like", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdIn(List<String> values) {
            addCriterion("classified_id in", values, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdNotIn(List<String> values) {
            addCriterion("classified_id not in", values, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdBetween(String value1, String value2) {
            addCriterion("classified_id between", value1, value2, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdNotBetween(String value1, String value2) {
            addCriterion("classified_id not between", value1, value2, "classifiedId");
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

        public Criteria andClassifiedRemarkIsNull() {
            addCriterion("classified_remark is null");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkIsNotNull() {
            addCriterion("classified_remark is not null");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkEqualTo(String value) {
            addCriterion("classified_remark =", value, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkNotEqualTo(String value) {
            addCriterion("classified_remark <>", value, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkGreaterThan(String value) {
            addCriterion("classified_remark >", value, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("classified_remark >=", value, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkLessThan(String value) {
            addCriterion("classified_remark <", value, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkLessThanOrEqualTo(String value) {
            addCriterion("classified_remark <=", value, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkLike(String value) {
            addCriterion("classified_remark like", value, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkNotLike(String value) {
            addCriterion("classified_remark not like", value, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkIn(List<String> values) {
            addCriterion("classified_remark in", values, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkNotIn(List<String> values) {
            addCriterion("classified_remark not in", values, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkBetween(String value1, String value2) {
            addCriterion("classified_remark between", value1, value2, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedRemarkNotBetween(String value1, String value2) {
            addCriterion("classified_remark not between", value1, value2, "classifiedRemark");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameIsNull() {
            addCriterion("classified_res_name is null");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameIsNotNull() {
            addCriterion("classified_res_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameEqualTo(String value) {
            addCriterion("classified_res_name =", value, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameNotEqualTo(String value) {
            addCriterion("classified_res_name <>", value, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameGreaterThan(String value) {
            addCriterion("classified_res_name >", value, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameGreaterThanOrEqualTo(String value) {
            addCriterion("classified_res_name >=", value, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameLessThan(String value) {
            addCriterion("classified_res_name <", value, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameLessThanOrEqualTo(String value) {
            addCriterion("classified_res_name <=", value, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameLike(String value) {
            addCriterion("classified_res_name like", value, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameNotLike(String value) {
            addCriterion("classified_res_name not like", value, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameIn(List<String> values) {
            addCriterion("classified_res_name in", values, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameNotIn(List<String> values) {
            addCriterion("classified_res_name not in", values, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameBetween(String value1, String value2) {
            addCriterion("classified_res_name between", value1, value2, "classifiedResName");
            return (Criteria) this;
        }

        public Criteria andClassifiedResNameNotBetween(String value1, String value2) {
            addCriterion("classified_res_name not between", value1, value2, "classifiedResName");
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