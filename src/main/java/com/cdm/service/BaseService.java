package com.cdm.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseService<T,TE>{

    int countByExample(TE example);

    int deleteByExample(TE example);

    int deleteByPrimaryKey(Integer locationId);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(TE example);

    T selectByPrimaryKey(Integer locationId);

    int updateByExampleSelective(@Param("record") T record, @Param("example") TE example);

    int updateByExample(@Param("record") T record, @Param("example") TE example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);





}
