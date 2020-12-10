package com.duxing.xhc.api.common.model;

public class TUserGoodsSellNotice {
    private String goodsSellNoticeId;

    private String userId;

    private String goodsMarketingId;

    private String sellTime;

    private String createTime;

    private Integer status;

    public String getGoodsSellNoticeId() {
        return goodsSellNoticeId;
    }

    public void setGoodsSellNoticeId(String goodsSellNoticeId) {
        this.goodsSellNoticeId = goodsSellNoticeId == null ? null : goodsSellNoticeId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getGoodsMarketingId() {
        return goodsMarketingId;
    }

    public void setGoodsMarketingId(String goodsMarketingId) {
        this.goodsMarketingId = goodsMarketingId == null ? null : goodsMarketingId.trim();
    }

    public String getSellTime() {
        return sellTime;
    }

    public void setSellTime(String sellTime) {
        this.sellTime = sellTime == null ? null : sellTime.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}