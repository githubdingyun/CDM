package com.cdm.service.impl;

import com.cdm.dao.LocationMapper;
import com.cdm.model.Location;
import com.cdm.model.LocationExample;
import com.cdm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements BaseService<Location,LocationExample> {
    @Autowired
    LocationMapper locationMapper;

    public int countByExample(LocationExample example) {
        return locationMapper.countByExample(example);
    }

    public int deleteByExample(LocationExample example) {
        return locationMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer locationId) {
        return locationMapper.deleteByPrimaryKey(locationId);
    }

    public int insert(Location record) {
        return locationMapper.insert(record);
    }

    public int insertSelective(Location record) {
        return locationMapper.insertSelective(record);
    }

    public List<Location> selectByExample(LocationExample example) {
        return locationMapper.selectByExample(example);
    }

    public Location selectByPrimaryKey(Integer locationId) {
        return locationMapper.selectByPrimaryKey(locationId);
    }

    public int updateByExampleSelective(Location record, LocationExample example) {
        return locationMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(Location record, LocationExample example) {
        return locationMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Location record) {
        return locationMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Location record) {
        return locationMapper.updateByPrimaryKey(record);
    }
}
