package com.cdm.service.impl;

import com.cdm.dao.WarehouseMapper;
import com.cdm.model.Warehouse;
import com.cdm.model.WarehouseExample;
import com.cdm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class WarehouseServiceImpl implements BaseService<Warehouse,WarehouseExample> {
    @Autowired
    WarehouseMapper warehouseMapper;

    public int countByExample(WarehouseExample example) {
        return warehouseMapper.countByExample(example);
    }

    public int deleteByExample(WarehouseExample example) {
        return warehouseMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer warehouseId) {
        return warehouseMapper.deleteByPrimaryKey(warehouseId);
    }

    public int insert(Warehouse record) {
        return warehouseMapper.insert(record);
    }

    public int insertSelective(Warehouse record) {
        return warehouseMapper.insertSelective(record);
    }

    public List<Warehouse> selectByExample(WarehouseExample example) {
        return warehouseMapper.selectByExample(example);
    }

    public Warehouse selectByPrimaryKey(Integer warehouseId) {
        return warehouseMapper.selectByPrimaryKey(warehouseId);
    }

    public int updateByExampleSelective(Warehouse record, WarehouseExample example) {
        return warehouseMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(Warehouse record, WarehouseExample example) {
        return warehouseMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Warehouse record) {
        return warehouseMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Warehouse record) {
        return warehouseMapper.updateByPrimaryKey(record);
    }
}
