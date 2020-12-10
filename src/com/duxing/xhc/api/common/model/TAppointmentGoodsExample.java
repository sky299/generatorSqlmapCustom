package com.duxing.xhc.api.common.model;

import java.util.ArrayList;
import java.util.List;

public class TAppointmentGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String sumCol;

    public TAppointmentGoodsExample() {
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
        this.sumCol = null;
    }

    public String getSumCol() {
        return this.sumCol;
    }

    public void setSumCol(String sumCol) {
        this.sumCol = sumCol;
    }

    public TAppointmentGoodsExample sumAppointmentGoodsId() {
        this.sumCol="appointment_goods_id";
        return this;
    }

    public TAppointmentGoodsExample sumGoodsId() {
        this.sumCol="goods_id";
        return this;
    }

    public TAppointmentGoodsExample sumGoodsMarketingId() {
        this.sumCol="goods_marketing_id";
        return this;
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

        public Criteria andAppointmentGoodsIdIsNull() {
            addCriterion("appointment_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdIsNotNull() {
            addCriterion("appointment_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdEqualTo(String value) {
            addCriterion("appointment_goods_id =", value, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdNotEqualTo(String value) {
            addCriterion("appointment_goods_id <>", value, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdGreaterThan(String value) {
            addCriterion("appointment_goods_id >", value, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_goods_id >=", value, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdLessThan(String value) {
            addCriterion("appointment_goods_id <", value, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("appointment_goods_id <=", value, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdLike(String value) {
            addCriterion("appointment_goods_id like", value, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdNotLike(String value) {
            addCriterion("appointment_goods_id not like", value, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdIn(List<String> values) {
            addCriterion("appointment_goods_id in", values, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdNotIn(List<String> values) {
            addCriterion("appointment_goods_id not in", values, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdBetween(String value1, String value2) {
            addCriterion("appointment_goods_id between", value1, value2, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentGoodsIdNotBetween(String value1, String value2) {
            addCriterion("appointment_goods_id not between", value1, value2, "appointmentGoodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdIsNull() {
            addCriterion("goods_marketing_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdIsNotNull() {
            addCriterion("goods_marketing_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdEqualTo(String value) {
            addCriterion("goods_marketing_id =", value, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdNotEqualTo(String value) {
            addCriterion("goods_marketing_id <>", value, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdGreaterThan(String value) {
            addCriterion("goods_marketing_id >", value, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_marketing_id >=", value, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdLessThan(String value) {
            addCriterion("goods_marketing_id <", value, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdLessThanOrEqualTo(String value) {
            addCriterion("goods_marketing_id <=", value, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdLike(String value) {
            addCriterion("goods_marketing_id like", value, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdNotLike(String value) {
            addCriterion("goods_marketing_id not like", value, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdIn(List<String> values) {
            addCriterion("goods_marketing_id in", values, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdNotIn(List<String> values) {
            addCriterion("goods_marketing_id not in", values, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdBetween(String value1, String value2) {
            addCriterion("goods_marketing_id between", value1, value2, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketingIdNotBetween(String value1, String value2) {
            addCriterion("goods_marketing_id not between", value1, value2, "goodsMarketingId");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
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