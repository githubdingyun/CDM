package com.cdm.service.impl;

import com.cdm.dao.SupplierMapper;
import com.cdm.model.Supplier;
import com.cdm.model.SupplierExample;
import com.cdm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SupplierServiceImpl implements BaseService<Supplier,SupplierExample> {
    @Autowired
    SupplierMapper supplierMapper;

    public int countByExample(SupplierExample example) {
        return supplierMapper.countByExample(example);
    }

    public int deleteByExample(SupplierExample example) {
        return supplierMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer supplierId) {
        return supplierMapper.deleteByPrimaryKey(supplierId);
    }

    public int insert(Supplier record) {
        return supplierMapper.insert(record);
    }

    public int insertSelective(Supplier record) {
        return supplierMapper.insertSelective(record);
    }

    public List<Supplier> selectByExample(SupplierExample example) {
        return supplierMapper.selectByExample(example);
    }

    public Supplier selectByPrimaryKey(Integer supplierId) {
        return supplierMapper.selectByPrimaryKey(supplierId);
    }

    public int updateByExampleSelective(Supplier record, SupplierExample example) {
        return supplierMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(Supplier record, SupplierExample example) {
        return supplierMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Supplier record) {
        return supplierMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Supplier record) {
        return supplierMapper.updateByPrimaryKey(record);
    }
}
