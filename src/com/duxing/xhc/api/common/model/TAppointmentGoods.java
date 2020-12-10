package com.duxing.xhc.api.common.model;

public class TAppointmentGoods {
    private String appointmentGoodsId;

    private String goodsId;

    private String goodsMarketingId;

    public String getAppointmentGoodsId() {
        return appointmentGoodsId;
    }

    public void setAppointmentGoodsId(String appointmentGoodsId) {
        this.appointmentGoodsId = appointmentGoodsId == null ? null : appointmentGoodsId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsMarketingId() {
        return goodsMarketingId;
    }

    public void setGoodsMarketingId(String goodsMarketingId) {
        this.goodsMarketingId = goodsMarketingId == null ? null : goodsMarketingId.trim();
    }
}