package com.cdm.dao;

import com.cdm.model.WarehouseMaterial;
import com.cdm.model.WarehouseMaterialExample;
import com.cdm.model.WarehouseMaterialKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseMaterialMapper {
    int countByExample(WarehouseMaterialExample example);

    int deleteByExample(WarehouseMaterialExample example);

    int deleteByPrimaryKey(WarehouseMaterialKey key);

    int insert(WarehouseMaterial record);

    int insertSelective(WarehouseMaterial record);

    List<WarehouseMaterial> selectByExample(WarehouseMaterialExample example);

    WarehouseMaterial selectByPrimaryKey(WarehouseMaterialKey key);

    int updateByExampleSelective(@Param("record") WarehouseMaterial record, @Param("example") WarehouseMaterialExample example);

    int updateByExample(@Param("record") WarehouseMaterial record, @Param("example") WarehouseMaterialExample example);

    int updateByPrimaryKeySelective(WarehouseMaterial record);

    int updateByPrimaryKey(WarehouseMaterial record);
}