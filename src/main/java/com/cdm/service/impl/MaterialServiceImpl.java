package com.cdm.service.impl;

import com.cdm.dao.MaterialMapper;
import com.cdm.model.Material;
import com.cdm.model.MaterialExample;
import com.cdm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class MaterialServiceImpl implements BaseService<Material,MaterialExample> {
    @Autowired
    MaterialMapper materialMapper;

    public int countByExample(MaterialExample example) {
        return materialMapper.countByExample(example);
    }

    public int deleteByExample(MaterialExample example) {
        return materialMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer materialId) {
        return materialMapper.deleteByPrimaryKey(materialId);
    }

    public int insert(Material record) {
        return materialMapper.insert(record);
    }

    public int insertSelective(Material record) {
        return materialMapper.insertSelective(record);
    }

    public List<Material> selectByExample(MaterialExample example) {
        return materialMapper.selectByExample(example);
    }

    public Material selectByPrimaryKey(Integer materialId) {
        return materialMapper.selectByPrimaryKey(materialId);
    }

    public int updateByExampleSelective(Material record, MaterialExample example) {
        return materialMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(Material record, MaterialExample example) {
        return materialMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Material record) {
        return materialMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Material record) {
        return materialMapper.updateByPrimaryKey(record);
    }
}
