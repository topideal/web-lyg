package com.misnz.lyc.model;

import java.util.ArrayList;
import java.util.List;

public class TLycInfoFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLycInfoFileExample() {
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

        public Criteria andInfoFileIdIsNull() {
            addCriterion("info_file_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdIsNotNull() {
            addCriterion("info_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdEqualTo(String value) {
            addCriterion("info_file_id =", value, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdNotEqualTo(String value) {
            addCriterion("info_file_id <>", value, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdGreaterThan(String value) {
            addCriterion("info_file_id >", value, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("info_file_id >=", value, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdLessThan(String value) {
            addCriterion("info_file_id <", value, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdLessThanOrEqualTo(String value) {
            addCriterion("info_file_id <=", value, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdLike(String value) {
            addCriterion("info_file_id like", value, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdNotLike(String value) {
            addCriterion("info_file_id not like", value, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdIn(List<String> values) {
            addCriterion("info_file_id in", values, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdNotIn(List<String> values) {
            addCriterion("info_file_id not in", values, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdBetween(String value1, String value2) {
            addCriterion("info_file_id between", value1, value2, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoFileIdNotBetween(String value1, String value2) {
            addCriterion("info_file_id not between", value1, value2, "infoFileId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(String value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(String value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(String value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(String value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(String value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLike(String value) {
            addCriterion("info_id like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotLike(String value) {
            addCriterion("info_id not like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<String> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<String> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(String value1, String value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(String value1, String value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andIsVideoIsNull() {
            addCriterion("is_video is null");
            return (Criteria) this;
        }

        public Criteria andIsVideoIsNotNull() {
            addCriterion("is_video is not null");
            return (Criteria) this;
        }

        public Criteria andIsVideoEqualTo(Integer value) {
            addCriterion("is_video =", value, "isVideo");
            return (Criteria) this;
        }

        public Criteria andIsVideoNotEqualTo(Integer value) {
            addCriterion("is_video <>", value, "isVideo");
            return (Criteria) this;
        }

        public Criteria andIsVideoGreaterThan(Integer value) {
            addCriterion("is_video >", value, "isVideo");
            return (Criteria) this;
        }

        public Criteria andIsVideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_video >=", value, "isVideo");
            return (Criteria) this;
        }

        public Criteria andIsVideoLessThan(Integer value) {
            addCriterion("is_video <", value, "isVideo");
            return (Criteria) this;
        }

        public Criteria andIsVideoLessThanOrEqualTo(Integer value) {
            addCriterion("is_video <=", value, "isVideo");
            return (Criteria) this;
        }

        public Criteria andIsVideoIn(List<Integer> values) {
            addCriterion("is_video in", values, "isVideo");
            return (Criteria) this;
        }

        public Criteria andIsVideoNotIn(List<Integer> values) {
            addCriterion("is_video not in", values, "isVideo");
            return (Criteria) this;
        }

        public Criteria andIsVideoBetween(Integer value1, Integer value2) {
            addCriterion("is_video between", value1, value2, "isVideo");
            return (Criteria) this;
        }

        public Criteria andIsVideoNotBetween(Integer value1, Integer value2) {
            addCriterion("is_video not between", value1, value2, "isVideo");
            return (Criteria) this;
        }

        public Criteria andSortFiledIsNull() {
            addCriterion("sort_filed is null");
            return (Criteria) this;
        }

        public Criteria andSortFiledIsNotNull() {
            addCriterion("sort_filed is not null");
            return (Criteria) this;
        }

        public Criteria andSortFiledEqualTo(Integer value) {
            addCriterion("sort_filed =", value, "sortFiled");
            return (Criteria) this;
        }

        public Criteria andSortFiledNotEqualTo(Integer value) {
            addCriterion("sort_filed <>", value, "sortFiled");
            return (Criteria) this;
        }

        public Criteria andSortFiledGreaterThan(Integer value) {
            addCriterion("sort_filed >", value, "sortFiled");
            return (Criteria) this;
        }

        public Criteria andSortFiledGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_filed >=", value, "sortFiled");
            return (Criteria) this;
        }

        public Criteria andSortFiledLessThan(Integer value) {
            addCriterion("sort_filed <", value, "sortFiled");
            return (Criteria) this;
        }

        public Criteria andSortFiledLessThanOrEqualTo(Integer value) {
            addCriterion("sort_filed <=", value, "sortFiled");
            return (Criteria) this;
        }

        public Criteria andSortFiledIn(List<Integer> values) {
            addCriterion("sort_filed in", values, "sortFiled");
            return (Criteria) this;
        }

        public Criteria andSortFiledNotIn(List<Integer> values) {
            addCriterion("sort_filed not in", values, "sortFiled");
            return (Criteria) this;
        }

        public Criteria andSortFiledBetween(Integer value1, Integer value2) {
            addCriterion("sort_filed between", value1, value2, "sortFiled");
            return (Criteria) this;
        }

        public Criteria andSortFiledNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_filed not between", value1, value2, "sortFiled");
            return (Criteria) this;
        }

        public Criteria andOptDateIsNull() {
            addCriterion("opt_date is null");
            return (Criteria) this;
        }

        public Criteria andOptDateIsNotNull() {
            addCriterion("opt_date is not null");
            return (Criteria) this;
        }

        public Criteria andOptDateEqualTo(Long value) {
            addCriterion("opt_date =", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateNotEqualTo(Long value) {
            addCriterion("opt_date <>", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateGreaterThan(Long value) {
            addCriterion("opt_date >", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateGreaterThanOrEqualTo(Long value) {
            addCriterion("opt_date >=", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateLessThan(Long value) {
            addCriterion("opt_date <", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateLessThanOrEqualTo(Long value) {
            addCriterion("opt_date <=", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateIn(List<Long> values) {
            addCriterion("opt_date in", values, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateNotIn(List<Long> values) {
            addCriterion("opt_date not in", values, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateBetween(Long value1, Long value2) {
            addCriterion("opt_date between", value1, value2, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateNotBetween(Long value1, Long value2) {
            addCriterion("opt_date not between", value1, value2, "optDate");
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