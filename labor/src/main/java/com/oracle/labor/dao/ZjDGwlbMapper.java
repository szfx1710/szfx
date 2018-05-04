package com.oracle.labor.dao;

import com.oracle.labor.po.ZjDGwlb;
import com.oracle.labor.po.ZjDGwlbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZjDGwlbMapper {
    long countByExample(ZjDGwlbExample example);

    int deleteByExample(ZjDGwlbExample example);

    int deleteByPrimaryKey(String dmid);

    int insert(ZjDGwlb record);

    int insertSelective(ZjDGwlb record);

    List<ZjDGwlb> selectByExample(ZjDGwlbExample example);

    ZjDGwlb selectByPrimaryKey(String dmid);

    int updateByExampleSelective(@Param("record") ZjDGwlb record, @Param("example") ZjDGwlbExample example);

    int updateByExample(@Param("record") ZjDGwlb record, @Param("example") ZjDGwlbExample example);

    int updateByPrimaryKeySelective(ZjDGwlb record);

    int updateByPrimaryKey(ZjDGwlb record);
}