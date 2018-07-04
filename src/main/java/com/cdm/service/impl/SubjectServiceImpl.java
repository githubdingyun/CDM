package com.cdm.service.impl;

import com.cdm.dao.SubjectMapper;
import com.cdm.model.Subject;
import com.cdm.model.SubjectExample;
import com.cdm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SubjectServiceImpl implements BaseService<Subject,SubjectExample> {
    @Autowired
    SubjectMapper subjectMapper;

    public int countByExample(SubjectExample example) {
        return subjectMapper.countByExample(example);
    }

    public int deleteByExample(SubjectExample example) {
        return subjectMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer subjectId) {
        return subjectMapper.deleteByPrimaryKey(subjectId);
    }

    public int insert(Subject record) {
        return subjectMapper.insert(record);
    }

    public int insertSelective(Subject record) {
        return subjectMapper.insertSelective(record);
    }

    public List<Subject> selectByExample(SubjectExample example) {
        return subjectMapper.selectByExample(example);
    }

    public Subject selectByPrimaryKey(Integer subjectId) {
        return subjectMapper.selectByPrimaryKey(subjectId);
    }

    public int updateByExampleSelective(Subject record, SubjectExample example) {
        return subjectMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(Subject record, SubjectExample example) {
        return subjectMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Subject record) {
        return subjectMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Subject record) {
        return subjectMapper.updateByPrimaryKey(record);
    }
}
