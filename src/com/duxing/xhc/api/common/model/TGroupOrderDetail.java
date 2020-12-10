package com.duxing.xhc.api.common.model;

public class TGroupOrderDetail {
    private String groupOrderDetailId;

    private String groupOrderId;

    private String userId;

    private String userName;

    private String goodsMarketingId;

    private String userImgUrl;

    private String orderId;

    private String createTime;

    private String cityName;

    private String cityId;

    private Integer payStatus;

    private Integer refundStatus;

    private Integer groupStatus;

    public String getGroupOrderDetailId() {
        return groupOrderDetailId;
    }

    public void setGroupOrderDetailId(String groupOrderDetailId) {
        this.groupOrderDetailId = groupOrderDetailId == null ? null : groupOrderDetailId.trim();
    }

    public String getGroupOrderId() {
        return groupOrderId;
    }

    public void setGroupOrderId(String groupOrderId) {
        this.groupOrderId = groupOrderId == null ? null : groupOrderId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getGoodsMarketingId() {
        return goodsMarketingId;
    }

    public void setGoodsMarketingId(String goodsMarketingId) {
        this.goodsMarketingId = goodsMarketingId == null ? null : goodsMarketingId.trim();
    }

    public String getUserImgUrl() {
        return userImgUrl;
    }

    public void setUserImgUrl(String userImgUrl) {
        this.userImgUrl = userImgUrl == null ? null : userImgUrl.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Integer getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
    }
}