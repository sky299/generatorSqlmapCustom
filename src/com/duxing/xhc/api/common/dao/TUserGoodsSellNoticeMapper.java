package com.duxing.xhc.api.common.dao;

import com.duxing.xhc.api.common.model.TUserGoodsSellNotice;
import com.duxing.xhc.api.common.model.TUserGoodsSellNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserGoodsSellNoticeMapper {
    long countByExample(TUserGoodsSellNoticeExample example);

    int deleteByExample(TUserGoodsSellNoticeExample example);

    int deleteByPrimaryKey(String goodsSellNoticeId);

    int insert(TUserGoodsSellNotice record);

    int insertSelective(TUserGoodsSellNotice record);

    List<TUserGoodsSellNotice> selectByExample(TUserGoodsSellNoticeExample example);

    TUserGoodsSellNotice selectByPrimaryKey(String goodsSellNoticeId);

    int updateByExampleSelective(@Param("record") TUserGoodsSellNotice record, @Param("example") TUserGoodsSellNoticeExample example);

    int updateByExample(@Param("record") TUserGoodsSellNotice record, @Param("example") TUserGoodsSellNoticeExample example);

    int updateByPrimaryKeySelective(TUserGoodsSellNotice record);

    int updateByPrimaryKey(TUserGoodsSellNotice record);

    Long sumByExample(TUserGoodsSellNoticeExample example);

    int batchUpdate(@Param("recordList") List<TUserGoodsSellNotice> recordList);

    int batchInsert(@Param("recordList") List<TUserGoodsSellNotice> recordList);

    int batchDelete(@Param("ids") String[] ids);
}