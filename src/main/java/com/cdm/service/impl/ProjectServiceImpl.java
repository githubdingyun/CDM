package com.cdm.service.impl;

import com.cdm.dao.ProjectMapper;
import com.cdm.model.Project;
import com.cdm.model.ProjectExample;
import com.cdm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProjectServiceImpl implements BaseService<Project,ProjectExample> {
    @Autowired
    ProjectMapper projectMapper;

    public int countByExample(ProjectExample example) {
        return projectMapper.countByExample(example);
    }

    public int deleteByExample(ProjectExample example) {
        return projectMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer projectId) {
        return projectMapper.deleteByPrimaryKey(projectId);
    }

    public int insert(Project record) {
        return projectMapper.insert(record);
    }

    public int insertSelective(Project record) {
        return projectMapper.insertSelective(record);
    }

    public List<Project> selectByExample(ProjectExample example) {
        return projectMapper.selectByExample(example);
    }

    public Project selectByPrimaryKey(Integer projectId) {
        return projectMapper.selectByPrimaryKey(projectId);
    }

    public int updateByExampleSelective(Project record, ProjectExample example) {
        return projectMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(Project record, ProjectExample example) {
        return projectMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Project record) {
        return projectMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Project record) {
        return projectMapper.updateByPrimaryKey(record);
    }
}
