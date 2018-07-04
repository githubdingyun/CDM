package com.cdm.service.impl;

import com.cdm.dao.WorkerMapper;
import com.cdm.model.Worker;
import com.cdm.model.WorkerExample;
import com.cdm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class WorkerServiceImpl implements BaseService<Worker,WorkerExample> {
    @Autowired
    WorkerMapper workerMapper;

    public int countByExample(WorkerExample example) {
        return workerMapper.countByExample(example);
    }

    public int deleteByExample(WorkerExample example) {
        return workerMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer workerId) {
        return workerMapper.deleteByPrimaryKey(workerId);
    }

    public int insert(Worker record) {
        return workerMapper.insert(record);
    }

    public int insertSelective(Worker record) {
        return workerMapper.insertSelective(record);
    }

    public List<Worker> selectByExample(WorkerExample example) {
        return workerMapper.selectByExample(example);
    }

    public Worker selectByPrimaryKey(Integer workerId) {
        return workerMapper.selectByPrimaryKey(workerId);
    }

    public int updateByExampleSelective(Worker record, WorkerExample example) {
        return workerMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(Worker record, WorkerExample example) {
        return workerMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Worker record) {
        return workerMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Worker record) {
        return workerMapper.updateByPrimaryKey(record);
    }
}
