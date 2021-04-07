package com.misnz.lyc.model;

import java.util.ArrayList;
import java.util.List;

public class InfoSearchEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoSearchEntityExample() {
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

        public Criteria andBrandsTitleEnIsNull() {
            addCriterion("brands_title_en is null");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnIsNotNull() {
            addCriterion("brands_title_en is not null");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnEqualTo(String value) {
            addCriterion("brands_title_en =", value, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnNotEqualTo(String value) {
            addCriterion("brands_title_en <>", value, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnGreaterThan(String value) {
            addCriterion("brands_title_en >", value, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("brands_title_en >=", value, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnLessThan(String value) {
            addCriterion("brands_title_en <", value, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnLessThanOrEqualTo(String value) {
            addCriterion("brands_title_en <=", value, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnLike(String value) {
            addCriterion("brands_title_en like", value, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnNotLike(String value) {
            addCriterion("brands_title_en not like", value, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnIn(List<String> values) {
            addCriterion("brands_title_en in", values, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnNotIn(List<String> values) {
            addCriterion("brands_title_en not in", values, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnBetween(String value1, String value2) {
            addCriterion("brands_title_en between", value1, value2, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleEnNotBetween(String value1, String value2) {
            addCriterion("brands_title_en not between", value1, value2, "brandsTitleEn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnIsNull() {
            addCriterion("brands_title_cn is null");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnIsNotNull() {
            addCriterion("brands_title_cn is not null");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnEqualTo(String value) {
            addCriterion("brands_title_cn =", value, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnNotEqualTo(String value) {
            addCriterion("brands_title_cn <>", value, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnGreaterThan(String value) {
            addCriterion("brands_title_cn >", value, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnGreaterThanOrEqualTo(String value) {
            addCriterion("brands_title_cn >=", value, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnLessThan(String value) {
            addCriterion("brands_title_cn <", value, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnLessThanOrEqualTo(String value) {
            addCriterion("brands_title_cn <=", value, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnLike(String value) {
            addCriterion("brands_title_cn like", value, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnNotLike(String value) {
            addCriterion("brands_title_cn not like", value, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnIn(List<String> values) {
            addCriterion("brands_title_cn in", values, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnNotIn(List<String> values) {
            addCriterion("brands_title_cn not in", values, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnBetween(String value1, String value2) {
            addCriterion("brands_title_cn between", value1, value2, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andBrandsTitleCnNotBetween(String value1, String value2) {
            addCriterion("brands_title_cn not between", value1, value2, "brandsTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnIsNull() {
            addCriterion("country_title_cn is null");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnIsNotNull() {
            addCriterion("country_title_cn is not null");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnEqualTo(String value) {
            addCriterion("country_title_cn =", value, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnNotEqualTo(String value) {
            addCriterion("country_title_cn <>", value, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnGreaterThan(String value) {
            addCriterion("country_title_cn >", value, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnGreaterThanOrEqualTo(String value) {
            addCriterion("country_title_cn >=", value, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnLessThan(String value) {
            addCriterion("country_title_cn <", value, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnLessThanOrEqualTo(String value) {
            addCriterion("country_title_cn <=", value, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnLike(String value) {
            addCriterion("country_title_cn like", value, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnNotLike(String value) {
            addCriterion("country_title_cn not like", value, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnIn(List<String> values) {
            addCriterion("country_title_cn in", values, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnNotIn(List<String> values) {
            addCriterion("country_title_cn not in", values, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnBetween(String value1, String value2) {
            addCriterion("country_title_cn between", value1, value2, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleCnNotBetween(String value1, String value2) {
            addCriterion("country_title_cn not between", value1, value2, "countryTitleCn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnIsNull() {
            addCriterion("country_title_en is null");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnIsNotNull() {
            addCriterion("country_title_en is not null");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnEqualTo(String value) {
            addCriterion("country_title_en =", value, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnNotEqualTo(String value) {
            addCriterion("country_title_en <>", value, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnGreaterThan(String value) {
            addCriterion("country_title_en >", value, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("country_title_en >=", value, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnLessThan(String value) {
            addCriterion("country_title_en <", value, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnLessThanOrEqualTo(String value) {
            addCriterion("country_title_en <=", value, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnLike(String value) {
            addCriterion("country_title_en like", value, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnNotLike(String value) {
            addCriterion("country_title_en not like", value, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnIn(List<String> values) {
            addCriterion("country_title_en in", values, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnNotIn(List<String> values) {
            addCriterion("country_title_en not in", values, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnBetween(String value1, String value2) {
            addCriterion("country_title_en between", value1, value2, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andCountryTitleEnNotBetween(String value1, String value2) {
            addCriterion("country_title_en not between", value1, value2, "countryTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnIsNull() {
            addCriterion("trades_title_cn is null");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnIsNotNull() {
            addCriterion("trades_title_cn is not null");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnEqualTo(String value) {
            addCriterion("trades_title_cn =", value, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnNotEqualTo(String value) {
            addCriterion("trades_title_cn <>", value, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnGreaterThan(String value) {
            addCriterion("trades_title_cn >", value, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnGreaterThanOrEqualTo(String value) {
            addCriterion("trades_title_cn >=", value, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnLessThan(String value) {
            addCriterion("trades_title_cn <", value, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnLessThanOrEqualTo(String value) {
            addCriterion("trades_title_cn <=", value, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnLike(String value) {
            addCriterion("trades_title_cn like", value, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnNotLike(String value) {
            addCriterion("trades_title_cn not like", value, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnIn(List<String> values) {
            addCriterion("trades_title_cn in", values, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnNotIn(List<String> values) {
            addCriterion("trades_title_cn not in", values, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnBetween(String value1, String value2) {
            addCriterion("trades_title_cn between", value1, value2, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleCnNotBetween(String value1, String value2) {
            addCriterion("trades_title_cn not between", value1, value2, "tradesTitleCn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnIsNull() {
            addCriterion("trades_title_en is null");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnIsNotNull() {
            addCriterion("trades_title_en is not null");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnEqualTo(String value) {
            addCriterion("trades_title_en =", value, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnNotEqualTo(String value) {
            addCriterion("trades_title_en <>", value, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnGreaterThan(String value) {
            addCriterion("trades_title_en >", value, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("trades_title_en >=", value, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnLessThan(String value) {
            addCriterion("trades_title_en <", value, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnLessThanOrEqualTo(String value) {
            addCriterion("trades_title_en <=", value, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnLike(String value) {
            addCriterion("trades_title_en like", value, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnNotLike(String value) {
            addCriterion("trades_title_en not like", value, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnIn(List<String> values) {
            addCriterion("trades_title_en in", values, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnNotIn(List<String> values) {
            addCriterion("trades_title_en not in", values, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnBetween(String value1, String value2) {
            addCriterion("trades_title_en between", value1, value2, "tradesTitleEn");
            return (Criteria) this;
        }

        public Criteria andTradesTitleEnNotBetween(String value1, String value2) {
            addCriterion("trades_title_en not between", value1, value2, "tradesTitleEn");
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

        public Criteria andInfoTypeIsNull() {
            addCriterion("info_type is null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNotNull() {
            addCriterion("info_type is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeEqualTo(Integer value) {
            addCriterion("info_type =", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotEqualTo(Integer value) {
            addCriterion("info_type <>", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThan(Integer value) {
            addCriterion("info_type >", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_type >=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThan(Integer value) {
            addCriterion("info_type <", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("info_type <=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIn(List<Integer> values) {
            addCriterion("info_type in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotIn(List<Integer> values) {
            addCriterion("info_type not in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeBetween(Integer value1, Integer value2) {
            addCriterion("info_type between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("info_type not between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnIsNull() {
            addCriterion("info_title_en is null");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnIsNotNull() {
            addCriterion("info_title_en is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnEqualTo(String value) {
            addCriterion("info_title_en =", value, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnNotEqualTo(String value) {
            addCriterion("info_title_en <>", value, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnGreaterThan(String value) {
            addCriterion("info_title_en >", value, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("info_title_en >=", value, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnLessThan(String value) {
            addCriterion("info_title_en <", value, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnLessThanOrEqualTo(String value) {
            addCriterion("info_title_en <=", value, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnLike(String value) {
            addCriterion("info_title_en like", value, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnNotLike(String value) {
            addCriterion("info_title_en not like", value, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnIn(List<String> values) {
            addCriterion("info_title_en in", values, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnNotIn(List<String> values) {
            addCriterion("info_title_en not in", values, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnBetween(String value1, String value2) {
            addCriterion("info_title_en between", value1, value2, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEnNotBetween(String value1, String value2) {
            addCriterion("info_title_en not between", value1, value2, "infoTitleEn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnIsNull() {
            addCriterion("info_title_cn is null");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnIsNotNull() {
            addCriterion("info_title_cn is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnEqualTo(String value) {
            addCriterion("info_title_cn =", value, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnNotEqualTo(String value) {
            addCriterion("info_title_cn <>", value, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnGreaterThan(String value) {
            addCriterion("info_title_cn >", value, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnGreaterThanOrEqualTo(String value) {
            addCriterion("info_title_cn >=", value, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnLessThan(String value) {
            addCriterion("info_title_cn <", value, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnLessThanOrEqualTo(String value) {
            addCriterion("info_title_cn <=", value, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnLike(String value) {
            addCriterion("info_title_cn like", value, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnNotLike(String value) {
            addCriterion("info_title_cn not like", value, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnIn(List<String> values) {
            addCriterion("info_title_cn in", values, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnNotIn(List<String> values) {
            addCriterion("info_title_cn not in", values, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnBetween(String value1, String value2) {
            addCriterion("info_title_cn between", value1, value2, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoTitleCnNotBetween(String value1, String value2) {
            addCriterion("info_title_cn not between", value1, value2, "infoTitleCn");
            return (Criteria) this;
        }

        public Criteria andInfoResNameIsNull() {
            addCriterion("info_res_name is null");
            return (Criteria) this;
        }

        public Criteria andInfoResNameIsNotNull() {
            addCriterion("info_res_name is not null");
            return (Criteria) this;
        }

        public Criteria andInfoResNameEqualTo(String value) {
            addCriterion("info_res_name =", value, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameNotEqualTo(String value) {
            addCriterion("info_res_name <>", value, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameGreaterThan(String value) {
            addCriterion("info_res_name >", value, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameGreaterThanOrEqualTo(String value) {
            addCriterion("info_res_name >=", value, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameLessThan(String value) {
            addCriterion("info_res_name <", value, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameLessThanOrEqualTo(String value) {
            addCriterion("info_res_name <=", value, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameLike(String value) {
            addCriterion("info_res_name like", value, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameNotLike(String value) {
            addCriterion("info_res_name not like", value, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameIn(List<String> values) {
            addCriterion("info_res_name in", values, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameNotIn(List<String> values) {
            addCriterion("info_res_name not in", values, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameBetween(String value1, String value2) {
            addCriterion("info_res_name between", value1, value2, "infoResName");
            return (Criteria) this;
        }

        public Criteria andInfoResNameNotBetween(String value1, String value2) {
            addCriterion("info_res_name not between", value1, value2, "infoResName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Long value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Long value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Long value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Long value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Long value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Long value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Long> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Long> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Long value1, Long value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Long value1, Long value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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

        public Criteria andInfoMonthIsNull() {
            addCriterion("info_month is null");
            return (Criteria) this;
        }

        public Criteria andInfoMonthIsNotNull() {
            addCriterion("info_month is not null");
            return (Criteria) this;
        }

        public Criteria andInfoMonthEqualTo(String value) {
            addCriterion("info_month =", value, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthNotEqualTo(String value) {
            addCriterion("info_month <>", value, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthGreaterThan(String value) {
            addCriterion("info_month >", value, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthGreaterThanOrEqualTo(String value) {
            addCriterion("info_month >=", value, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthLessThan(String value) {
            addCriterion("info_month <", value, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthLessThanOrEqualTo(String value) {
            addCriterion("info_month <=", value, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthLike(String value) {
            addCriterion("info_month like", value, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthNotLike(String value) {
            addCriterion("info_month not like", value, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthIn(List<String> values) {
            addCriterion("info_month in", values, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthNotIn(List<String> values) {
            addCriterion("info_month not in", values, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthBetween(String value1, String value2) {
            addCriterion("info_month between", value1, value2, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andInfoMonthNotBetween(String value1, String value2) {
            addCriterion("info_month not between", value1, value2, "infoMonth");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(String value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(String value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(String value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(String value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(String value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(String value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLike(String value) {
            addCriterion("country_id like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotLike(String value) {
            addCriterion("country_id not like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<String> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<String> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(String value1, String value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(String value1, String value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdIsNull() {
            addCriterion("brands_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandsIdIsNotNull() {
            addCriterion("brands_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandsIdEqualTo(String value) {
            addCriterion("brands_id =", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotEqualTo(String value) {
            addCriterion("brands_id <>", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdGreaterThan(String value) {
            addCriterion("brands_id >", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdGreaterThanOrEqualTo(String value) {
            addCriterion("brands_id >=", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdLessThan(String value) {
            addCriterion("brands_id <", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdLessThanOrEqualTo(String value) {
            addCriterion("brands_id <=", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdLike(String value) {
            addCriterion("brands_id like", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotLike(String value) {
            addCriterion("brands_id not like", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdIn(List<String> values) {
            addCriterion("brands_id in", values, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotIn(List<String> values) {
            addCriterion("brands_id not in", values, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdBetween(String value1, String value2) {
            addCriterion("brands_id between", value1, value2, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotBetween(String value1, String value2) {
            addCriterion("brands_id not between", value1, value2, "brandsId");
            return (Criteria) this;
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

        public Criteria andTradeIdIsNull() {
            addCriterion("trade_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(String value) {
            addCriterion("trade_id =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(String value) {
            addCriterion("trade_id <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(String value) {
            addCriterion("trade_id >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("trade_id >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(String value) {
            addCriterion("trade_id <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(String value) {
            addCriterion("trade_id <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLike(String value) {
            addCriterion("trade_id like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotLike(String value) {
            addCriterion("trade_id not like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<String> values) {
            addCriterion("trade_id in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<String> values) {
            addCriterion("trade_id not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(String value1, String value2) {
            addCriterion("trade_id between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(String value1, String value2) {
            addCriterion("trade_id not between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNull() {
            addCriterion("browser is null");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNotNull() {
            addCriterion("browser is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualTo(Integer value) {
            addCriterion("browser =", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualTo(Integer value) {
            addCriterion("browser <>", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThan(Integer value) {
            addCriterion("browser >", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualTo(Integer value) {
            addCriterion("browser >=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThan(Integer value) {
            addCriterion("browser <", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualTo(Integer value) {
            addCriterion("browser <=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserIn(List<Integer> values) {
            addCriterion("browser in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotIn(List<Integer> values) {
            addCriterion("browser not in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserBetween(Integer value1, Integer value2) {
            addCriterion("browser between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotBetween(Integer value1, Integer value2) {
            addCriterion("browser not between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
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