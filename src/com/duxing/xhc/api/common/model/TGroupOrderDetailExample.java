package com.duxing.xhc.api.common.model;

import java.util.ArrayList;
import java.util.List;

public class TGroupOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String sumCol;

    public TGroupOrderDetailExample() {
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

    public TGroupOrderDetailExample sumGroupOrderDetailId() {
        this.sumCol="group_order_detail_id";
        return this;
    }

    public TGroupOrderDetailExample sumGroupOrderId() {
        this.sumCol="group_order_id";
        return this;
    }

    public TGroupOrderDetailExample sumUserId() {
        this.sumCol="user_id";
        return this;
    }

    public TGroupOrderDetailExample sumUserName() {
        this.sumCol="user_name";
        return this;
    }

    public TGroupOrderDetailExample sumGoodsMarketingId() {
        this.sumCol="goods_marketing_id";
        return this;
    }

    public TGroupOrderDetailExample sumUserImgUrl() {
        this.sumCol="user_img_url";
        return this;
    }

    public TGroupOrderDetailExample sumOrderId() {
        this.sumCol="order_id";
        return this;
    }

    public TGroupOrderDetailExample sumCreateTime() {
        this.sumCol="create_time";
        return this;
    }

    public TGroupOrderDetailExample sumCityName() {
        this.sumCol="city_name";
        return this;
    }

    public TGroupOrderDetailExample sumCityId() {
        this.sumCol="city_id";
        return this;
    }

    public TGroupOrderDetailExample sumPayStatus() {
        this.sumCol="pay_status";
        return this;
    }

    public TGroupOrderDetailExample sumRefundStatus() {
        this.sumCol="refund_status";
        return this;
    }

    public TGroupOrderDetailExample sumGroupStatus() {
        this.sumCol="group_status";
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

        public Criteria andGroupOrderDetailIdIsNull() {
            addCriterion("group_order_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdIsNotNull() {
            addCriterion("group_order_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdEqualTo(String value) {
            addCriterion("group_order_detail_id =", value, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdNotEqualTo(String value) {
            addCriterion("group_order_detail_id <>", value, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdGreaterThan(String value) {
            addCriterion("group_order_detail_id >", value, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_order_detail_id >=", value, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdLessThan(String value) {
            addCriterion("group_order_detail_id <", value, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdLessThanOrEqualTo(String value) {
            addCriterion("group_order_detail_id <=", value, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdLike(String value) {
            addCriterion("group_order_detail_id like", value, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdNotLike(String value) {
            addCriterion("group_order_detail_id not like", value, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdIn(List<String> values) {
            addCriterion("group_order_detail_id in", values, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdNotIn(List<String> values) {
            addCriterion("group_order_detail_id not in", values, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdBetween(String value1, String value2) {
            addCriterion("group_order_detail_id between", value1, value2, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderDetailIdNotBetween(String value1, String value2) {
            addCriterion("group_order_detail_id not between", value1, value2, "groupOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdIsNull() {
            addCriterion("group_order_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdIsNotNull() {
            addCriterion("group_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdEqualTo(String value) {
            addCriterion("group_order_id =", value, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdNotEqualTo(String value) {
            addCriterion("group_order_id <>", value, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdGreaterThan(String value) {
            addCriterion("group_order_id >", value, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_order_id >=", value, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdLessThan(String value) {
            addCriterion("group_order_id <", value, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdLessThanOrEqualTo(String value) {
            addCriterion("group_order_id <=", value, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdLike(String value) {
            addCriterion("group_order_id like", value, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdNotLike(String value) {
            addCriterion("group_order_id not like", value, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdIn(List<String> values) {
            addCriterion("group_order_id in", values, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdNotIn(List<String> values) {
            addCriterion("group_order_id not in", values, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdBetween(String value1, String value2) {
            addCriterion("group_order_id between", value1, value2, "groupOrderId");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIdNotBetween(String value1, String value2) {
            addCriterion("group_order_id not between", value1, value2, "groupOrderId");
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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

        public Criteria andUserImgUrlIsNull() {
            addCriterion("user_img_url is null");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlIsNotNull() {
            addCriterion("user_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlEqualTo(String value) {
            addCriterion("user_img_url =", value, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlNotEqualTo(String value) {
            addCriterion("user_img_url <>", value, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlGreaterThan(String value) {
            addCriterion("user_img_url >", value, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_img_url >=", value, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlLessThan(String value) {
            addCriterion("user_img_url <", value, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlLessThanOrEqualTo(String value) {
            addCriterion("user_img_url <=", value, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlLike(String value) {
            addCriterion("user_img_url like", value, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlNotLike(String value) {
            addCriterion("user_img_url not like", value, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlIn(List<String> values) {
            addCriterion("user_img_url in", values, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlNotIn(List<String> values) {
            addCriterion("user_img_url not in", values, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlBetween(String value1, String value2) {
            addCriterion("user_img_url between", value1, value2, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserImgUrlNotBetween(String value1, String value2) {
            addCriterion("user_img_url not between", value1, value2, "userImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Integer value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Integer value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Integer value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Integer value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Integer> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Integer> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusIsNull() {
            addCriterion("group_status is null");
            return (Criteria) this;
        }

        public Criteria andGroupStatusIsNotNull() {
            addCriterion("group_status is not null");
            return (Criteria) this;
        }

        public Criteria andGroupStatusEqualTo(Integer value) {
            addCriterion("group_status =", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusNotEqualTo(Integer value) {
            addCriterion("group_status <>", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusGreaterThan(Integer value) {
            addCriterion("group_status >", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_status >=", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusLessThan(Integer value) {
            addCriterion("group_status <", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusLessThanOrEqualTo(Integer value) {
            addCriterion("group_status <=", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusIn(List<Integer> values) {
            addCriterion("group_status in", values, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusNotIn(List<Integer> values) {
            addCriterion("group_status not in", values, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusBetween(Integer value1, Integer value2) {
            addCriterion("group_status between", value1, value2, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("group_status not between", value1, value2, "groupStatus");
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