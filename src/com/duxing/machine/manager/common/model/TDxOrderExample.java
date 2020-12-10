package com.duxing.machine.manager.common.model;

import java.util.ArrayList;
import java.util.List;

public class TDxOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String sumCol;

    public TDxOrderExample() {
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

    public TDxOrderExample sumId() {
        this.sumCol="id";
        return this;
    }

    public TDxOrderExample sumThirdOrderNo() {
        this.sumCol="third_order_no";
        return this;
    }

    public TDxOrderExample sumOrderAmt() {
        this.sumCol="order_amt";
        return this;
    }

    public TDxOrderExample sumInvoiceAmt() {
        this.sumCol="invoice_amt";
        return this;
    }

    public TDxOrderExample sumBuyUser() {
        this.sumCol="buy_user";
        return this;
    }

    public TDxOrderExample sumSellUser() {
        this.sumCol="sell_user";
        return this;
    }

    public TDxOrderExample sumTaxRate() {
        this.sumCol="tax_rate";
        return this;
    }

    public TDxOrderExample sumRemark() {
        this.sumCol="remark";
        return this;
    }

    public TDxOrderExample sumStatus() {
        this.sumCol="status";
        return this;
    }

    public TDxOrderExample sumMissionId() {
        this.sumCol="mission_id";
        return this;
    }

    public TDxOrderExample sumCreateTime() {
        this.sumCol="create_time";
        return this;
    }

    public TDxOrderExample sumSeAmt() {
        this.sumCol="se_amt";
        return this;
    }

    public TDxOrderExample sumKprq() {
        this.sumCol="kprq";
        return this;
    }

    public TDxOrderExample sumIsMake() {
        this.sumCol="is_make";
        return this;
    }

    public TDxOrderExample sumToken() {
        this.sumCol="token";
        return this;
    }

    public TDxOrderExample sumFphm() {
        this.sumCol="fphm";
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

        public Criteria andThirdOrderNoIsNull() {
            addCriterion("third_order_no is null");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoIsNotNull() {
            addCriterion("third_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoEqualTo(String value) {
            addCriterion("third_order_no =", value, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoNotEqualTo(String value) {
            addCriterion("third_order_no <>", value, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoGreaterThan(String value) {
            addCriterion("third_order_no >", value, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("third_order_no >=", value, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoLessThan(String value) {
            addCriterion("third_order_no <", value, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoLessThanOrEqualTo(String value) {
            addCriterion("third_order_no <=", value, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoLike(String value) {
            addCriterion("third_order_no like", value, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoNotLike(String value) {
            addCriterion("third_order_no not like", value, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoIn(List<String> values) {
            addCriterion("third_order_no in", values, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoNotIn(List<String> values) {
            addCriterion("third_order_no not in", values, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoBetween(String value1, String value2) {
            addCriterion("third_order_no between", value1, value2, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andThirdOrderNoNotBetween(String value1, String value2) {
            addCriterion("third_order_no not between", value1, value2, "thirdOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIsNull() {
            addCriterion("order_amt is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIsNotNull() {
            addCriterion("order_amt is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmtEqualTo(Long value) {
            addCriterion("order_amt =", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotEqualTo(Long value) {
            addCriterion("order_amt <>", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtGreaterThan(Long value) {
            addCriterion("order_amt >", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("order_amt >=", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtLessThan(Long value) {
            addCriterion("order_amt <", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtLessThanOrEqualTo(Long value) {
            addCriterion("order_amt <=", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIn(List<Long> values) {
            addCriterion("order_amt in", values, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotIn(List<Long> values) {
            addCriterion("order_amt not in", values, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtBetween(Long value1, Long value2) {
            addCriterion("order_amt between", value1, value2, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotBetween(Long value1, Long value2) {
            addCriterion("order_amt not between", value1, value2, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtIsNull() {
            addCriterion("invoice_amt is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtIsNotNull() {
            addCriterion("invoice_amt is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtEqualTo(Long value) {
            addCriterion("invoice_amt =", value, "invoiceAmt");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtNotEqualTo(Long value) {
            addCriterion("invoice_amt <>", value, "invoiceAmt");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtGreaterThan(Long value) {
            addCriterion("invoice_amt >", value, "invoiceAmt");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("invoice_amt >=", value, "invoiceAmt");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtLessThan(Long value) {
            addCriterion("invoice_amt <", value, "invoiceAmt");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtLessThanOrEqualTo(Long value) {
            addCriterion("invoice_amt <=", value, "invoiceAmt");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtIn(List<Long> values) {
            addCriterion("invoice_amt in", values, "invoiceAmt");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtNotIn(List<Long> values) {
            addCriterion("invoice_amt not in", values, "invoiceAmt");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtBetween(Long value1, Long value2) {
            addCriterion("invoice_amt between", value1, value2, "invoiceAmt");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmtNotBetween(Long value1, Long value2) {
            addCriterion("invoice_amt not between", value1, value2, "invoiceAmt");
            return (Criteria) this;
        }

        public Criteria andBuyUserIsNull() {
            addCriterion("buy_user is null");
            return (Criteria) this;
        }

        public Criteria andBuyUserIsNotNull() {
            addCriterion("buy_user is not null");
            return (Criteria) this;
        }

        public Criteria andBuyUserEqualTo(String value) {
            addCriterion("buy_user =", value, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserNotEqualTo(String value) {
            addCriterion("buy_user <>", value, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserGreaterThan(String value) {
            addCriterion("buy_user >", value, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserGreaterThanOrEqualTo(String value) {
            addCriterion("buy_user >=", value, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserLessThan(String value) {
            addCriterion("buy_user <", value, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserLessThanOrEqualTo(String value) {
            addCriterion("buy_user <=", value, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserLike(String value) {
            addCriterion("buy_user like", value, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserNotLike(String value) {
            addCriterion("buy_user not like", value, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserIn(List<String> values) {
            addCriterion("buy_user in", values, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserNotIn(List<String> values) {
            addCriterion("buy_user not in", values, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserBetween(String value1, String value2) {
            addCriterion("buy_user between", value1, value2, "buyUser");
            return (Criteria) this;
        }

        public Criteria andBuyUserNotBetween(String value1, String value2) {
            addCriterion("buy_user not between", value1, value2, "buyUser");
            return (Criteria) this;
        }

        public Criteria andSellUserIsNull() {
            addCriterion("sell_user is null");
            return (Criteria) this;
        }

        public Criteria andSellUserIsNotNull() {
            addCriterion("sell_user is not null");
            return (Criteria) this;
        }

        public Criteria andSellUserEqualTo(String value) {
            addCriterion("sell_user =", value, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserNotEqualTo(String value) {
            addCriterion("sell_user <>", value, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserGreaterThan(String value) {
            addCriterion("sell_user >", value, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserGreaterThanOrEqualTo(String value) {
            addCriterion("sell_user >=", value, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserLessThan(String value) {
            addCriterion("sell_user <", value, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserLessThanOrEqualTo(String value) {
            addCriterion("sell_user <=", value, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserLike(String value) {
            addCriterion("sell_user like", value, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserNotLike(String value) {
            addCriterion("sell_user not like", value, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserIn(List<String> values) {
            addCriterion("sell_user in", values, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserNotIn(List<String> values) {
            addCriterion("sell_user not in", values, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserBetween(String value1, String value2) {
            addCriterion("sell_user between", value1, value2, "sellUser");
            return (Criteria) this;
        }

        public Criteria andSellUserNotBetween(String value1, String value2) {
            addCriterion("sell_user not between", value1, value2, "sellUser");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(String value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(String value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(String value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(String value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(String value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(String value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLike(String value) {
            addCriterion("tax_rate like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotLike(String value) {
            addCriterion("tax_rate not like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<String> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<String> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(String value1, String value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(String value1, String value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andMissionIdIsNull() {
            addCriterion("mission_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionIdIsNotNull() {
            addCriterion("mission_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIdEqualTo(String value) {
            addCriterion("mission_id =", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotEqualTo(String value) {
            addCriterion("mission_id <>", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThan(String value) {
            addCriterion("mission_id >", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("mission_id >=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThan(String value) {
            addCriterion("mission_id <", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThanOrEqualTo(String value) {
            addCriterion("mission_id <=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLike(String value) {
            addCriterion("mission_id like", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotLike(String value) {
            addCriterion("mission_id not like", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdIn(List<String> values) {
            addCriterion("mission_id in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotIn(List<String> values) {
            addCriterion("mission_id not in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdBetween(String value1, String value2) {
            addCriterion("mission_id between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotBetween(String value1, String value2) {
            addCriterion("mission_id not between", value1, value2, "missionId");
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

        public Criteria andSeAmtIsNull() {
            addCriterion("se_amt is null");
            return (Criteria) this;
        }

        public Criteria andSeAmtIsNotNull() {
            addCriterion("se_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSeAmtEqualTo(Long value) {
            addCriterion("se_amt =", value, "seAmt");
            return (Criteria) this;
        }

        public Criteria andSeAmtNotEqualTo(Long value) {
            addCriterion("se_amt <>", value, "seAmt");
            return (Criteria) this;
        }

        public Criteria andSeAmtGreaterThan(Long value) {
            addCriterion("se_amt >", value, "seAmt");
            return (Criteria) this;
        }

        public Criteria andSeAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("se_amt >=", value, "seAmt");
            return (Criteria) this;
        }

        public Criteria andSeAmtLessThan(Long value) {
            addCriterion("se_amt <", value, "seAmt");
            return (Criteria) this;
        }

        public Criteria andSeAmtLessThanOrEqualTo(Long value) {
            addCriterion("se_amt <=", value, "seAmt");
            return (Criteria) this;
        }

        public Criteria andSeAmtIn(List<Long> values) {
            addCriterion("se_amt in", values, "seAmt");
            return (Criteria) this;
        }

        public Criteria andSeAmtNotIn(List<Long> values) {
            addCriterion("se_amt not in", values, "seAmt");
            return (Criteria) this;
        }

        public Criteria andSeAmtBetween(Long value1, Long value2) {
            addCriterion("se_amt between", value1, value2, "seAmt");
            return (Criteria) this;
        }

        public Criteria andSeAmtNotBetween(Long value1, Long value2) {
            addCriterion("se_amt not between", value1, value2, "seAmt");
            return (Criteria) this;
        }

        public Criteria andKprqIsNull() {
            addCriterion("kprq is null");
            return (Criteria) this;
        }

        public Criteria andKprqIsNotNull() {
            addCriterion("kprq is not null");
            return (Criteria) this;
        }

        public Criteria andKprqEqualTo(String value) {
            addCriterion("kprq =", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotEqualTo(String value) {
            addCriterion("kprq <>", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqGreaterThan(String value) {
            addCriterion("kprq >", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqGreaterThanOrEqualTo(String value) {
            addCriterion("kprq >=", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLessThan(String value) {
            addCriterion("kprq <", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLessThanOrEqualTo(String value) {
            addCriterion("kprq <=", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLike(String value) {
            addCriterion("kprq like", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotLike(String value) {
            addCriterion("kprq not like", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqIn(List<String> values) {
            addCriterion("kprq in", values, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotIn(List<String> values) {
            addCriterion("kprq not in", values, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqBetween(String value1, String value2) {
            addCriterion("kprq between", value1, value2, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotBetween(String value1, String value2) {
            addCriterion("kprq not between", value1, value2, "kprq");
            return (Criteria) this;
        }

        public Criteria andIsMakeIsNull() {
            addCriterion("is_make is null");
            return (Criteria) this;
        }

        public Criteria andIsMakeIsNotNull() {
            addCriterion("is_make is not null");
            return (Criteria) this;
        }

        public Criteria andIsMakeEqualTo(Integer value) {
            addCriterion("is_make =", value, "isMake");
            return (Criteria) this;
        }

        public Criteria andIsMakeNotEqualTo(Integer value) {
            addCriterion("is_make <>", value, "isMake");
            return (Criteria) this;
        }

        public Criteria andIsMakeGreaterThan(Integer value) {
            addCriterion("is_make >", value, "isMake");
            return (Criteria) this;
        }

        public Criteria andIsMakeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_make >=", value, "isMake");
            return (Criteria) this;
        }

        public Criteria andIsMakeLessThan(Integer value) {
            addCriterion("is_make <", value, "isMake");
            return (Criteria) this;
        }

        public Criteria andIsMakeLessThanOrEqualTo(Integer value) {
            addCriterion("is_make <=", value, "isMake");
            return (Criteria) this;
        }

        public Criteria andIsMakeIn(List<Integer> values) {
            addCriterion("is_make in", values, "isMake");
            return (Criteria) this;
        }

        public Criteria andIsMakeNotIn(List<Integer> values) {
            addCriterion("is_make not in", values, "isMake");
            return (Criteria) this;
        }

        public Criteria andIsMakeBetween(Integer value1, Integer value2) {
            addCriterion("is_make between", value1, value2, "isMake");
            return (Criteria) this;
        }

        public Criteria andIsMakeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_make not between", value1, value2, "isMake");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
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