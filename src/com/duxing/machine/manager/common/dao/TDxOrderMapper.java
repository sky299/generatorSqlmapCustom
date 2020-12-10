package com.duxing.machine.manager.common.dao;

import com.duxing.machine.manager.common.model.TDxOrder;
import com.duxing.machine.manager.common.model.TDxOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDxOrderMapper {
    long countByExample(TDxOrderExample example);

    int deleteByExample(TDxOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(TDxOrder record);

    int insertSelective(TDxOrder record);

    List<TDxOrder> selectByExampleWithBLOBs(TDxOrderExample example);

    List<TDxOrder> selectByExample(TDxOrderExample example);

    TDxOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TDxOrder record, @Param("example") TDxOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") TDxOrder record, @Param("example") TDxOrderExample example);

    int updateByExample(@Param("record") TDxOrder record, @Param("example") TDxOrderExample example);

    int updateByPrimaryKeySelective(TDxOrder record);

    int updateByPrimaryKeyWithBLOBs(TDxOrder record);

    int updateByPrimaryKey(TDxOrder record);

    Long sumByExample(TDxOrderExample example);

    int batchUpdate(@Param("recordList") List<TDxOrder> recordList);

    int batchInsert(@Param("recordList") List<TDxOrder> recordList);

    int batchDelete(@Param("ids") String[] ids);
}