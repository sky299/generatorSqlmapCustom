package com.duxing.xhc.api.common.dao;

import com.duxing.xhc.api.common.model.TGroupOrderDetail;
import com.duxing.xhc.api.common.model.TGroupOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGroupOrderDetailMapper {
    long countByExample(TGroupOrderDetailExample example);

    int deleteByExample(TGroupOrderDetailExample example);

    int deleteByPrimaryKey(String groupOrderDetailId);

    int insert(TGroupOrderDetail record);

    int insertSelective(TGroupOrderDetail record);

    List<TGroupOrderDetail> selectByExample(TGroupOrderDetailExample example);

    TGroupOrderDetail selectByPrimaryKey(String groupOrderDetailId);

    int updateByExampleSelective(@Param("record") TGroupOrderDetail record, @Param("example") TGroupOrderDetailExample example);

    int updateByExample(@Param("record") TGroupOrderDetail record, @Param("example") TGroupOrderDetailExample example);

    int updateByPrimaryKeySelective(TGroupOrderDetail record);

    int updateByPrimaryKey(TGroupOrderDetail record);

    Long sumByExample(TGroupOrderDetailExample example);

    int batchUpdate(@Param("recordList") List<TGroupOrderDetail> recordList);

    int batchInsert(@Param("recordList") List<TGroupOrderDetail> recordList);

    int batchDelete(@Param("ids") String[] ids);
}