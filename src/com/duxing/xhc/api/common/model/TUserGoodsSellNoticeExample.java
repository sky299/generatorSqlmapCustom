package com.duxing.xhc.api.common.model;

import java.util.ArrayList;
import java.util.List;

public class TUserGoodsSellNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String sumCol;

    public TUserGoodsSellNoticeExample() {
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

    public TUserGoodsSellNoticeExample sumGoodsSellNoticeId() {
        this.sumCol="goods_sell_notice_id";
        return this;
    }

    public TUserGoodsSellNoticeExample sumUserId() {
        this.sumCol="user_id";
        return this;
    }

    public TUserGoodsSellNoticeExample sumGoodsMarketingId() {
        this.sumCol="goods_marketing_id";
        return this;
    }

    public TUserGoodsSellNoticeExample sumSellTime() {
        this.sumCol="sell_time";
        return this;
    }

    public TUserGoodsSellNoticeExample sumCreateTime() {
        this.sumCol="create_time";
        return this;
    }

    public TUserGoodsSellNoticeExample sumStatus() {
        this.sumCol="status";
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

        public Criteria andGoodsSellNoticeIdIsNull() {
            addCriterion("goods_sell_notice_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdIsNotNull() {
            addCriterion("goods_sell_notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdEqualTo(String value) {
            addCriterion("goods_sell_notice_id =", value, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdNotEqualTo(String value) {
            addCriterion("goods_sell_notice_id <>", value, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdGreaterThan(String value) {
            addCriterion("goods_sell_notice_id >", value, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sell_notice_id >=", value, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdLessThan(String value) {
            addCriterion("goods_sell_notice_id <", value, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdLessThanOrEqualTo(String value) {
            addCriterion("goods_sell_notice_id <=", value, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdLike(String value) {
            addCriterion("goods_sell_notice_id like", value, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdNotLike(String value) {
            addCriterion("goods_sell_notice_id not like", value, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdIn(List<String> values) {
            addCriterion("goods_sell_notice_id in", values, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdNotIn(List<String> values) {
            addCriterion("goods_sell_notice_id not in", values, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdBetween(String value1, String value2) {
            addCriterion("goods_sell_notice_id between", value1, value2, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNoticeIdNotBetween(String value1, String value2) {
            addCriterion("goods_sell_notice_id not between", value1, value2, "goodsSellNoticeId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andSellTimeIsNull() {
            addCriterion("sell_time is null");
            return (Criteria) this;
        }

        public Criteria andSellTimeIsNotNull() {
            addCriterion("sell_time is not null");
            return (Criteria) this;
        }

        public Criteria andSellTimeEqualTo(String value) {
            addCriterion("sell_time =", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotEqualTo(String value) {
            addCriterion("sell_time <>", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeGreaterThan(String value) {
            addCriterion("sell_time >", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_time >=", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeLessThan(String value) {
            addCriterion("sell_time <", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeLessThanOrEqualTo(String value) {
            addCriterion("sell_time <=", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeLike(String value) {
            addCriterion("sell_time like", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotLike(String value) {
            addCriterion("sell_time not like", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeIn(List<String> values) {
            addCriterion("sell_time in", values, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotIn(List<String> values) {
            addCriterion("sell_time not in", values, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeBetween(String value1, String value2) {
            addCriterion("sell_time between", value1, value2, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotBetween(String value1, String value2) {
            addCriterion("sell_time not between", value1, value2, "sellTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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