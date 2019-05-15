package com.satchain.dao;

import cn.itheima.pojo.TelemetryData;
import cn.itheima.pojo.TelemetryDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TelemetryDataMapper {
    int countByExample(TelemetryDataExample example);

    int deleteByExample(TelemetryDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TelemetryData record);

    int insertSelective(TelemetryData record);

    List<TelemetryData> selectByExample(TelemetryDataExample example);

    TelemetryData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TelemetryData record, @Param("example") TelemetryDataExample example);

    int updateByExample(@Param("record") TelemetryData record, @Param("example") TelemetryDataExample example);

    int updateByPrimaryKeySelective(TelemetryData record);

    int updateByPrimaryKey(TelemetryData record);
}