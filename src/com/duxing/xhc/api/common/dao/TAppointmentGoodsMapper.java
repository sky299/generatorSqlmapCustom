package com.duxing.xhc.api.common.dao;

import com.duxing.xhc.api.common.model.TAppointmentGoods;
import com.duxing.xhc.api.common.model.TAppointmentGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAppointmentGoodsMapper {
    long countByExample(TAppointmentGoodsExample example);

    int deleteByExample(TAppointmentGoodsExample example);

    int deleteByPrimaryKey(String appointmentGoodsId);

    int insert(TAppointmentGoods record);

    int insertSelective(TAppointmentGoods record);

    List<TAppointmentGoods> selectByExample(TAppointmentGoodsExample example);

    TAppointmentGoods selectByPrimaryKey(String appointmentGoodsId);

    int updateByExampleSelective(@Param("record") TAppointmentGoods record, @Param("example") TAppointmentGoodsExample example);

    int updateByExample(@Param("record") TAppointmentGoods record, @Param("example") TAppointmentGoodsExample example);

    int updateByPrimaryKeySelective(TAppointmentGoods record);

    int updateByPrimaryKey(TAppointmentGoods record);

    Long sumByExample(TAppointmentGoodsExample example);

    int batchUpdate(@Param("recordList") List<TAppointmentGoods> recordList);

    int batchInsert(@Param("recordList") List<TAppointmentGoods> recordList);

    int batchDelete(@Param("ids") String[] ids);
}