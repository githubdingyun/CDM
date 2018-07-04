package com.cdm.dao;

import com.cdm.model.ProjectMaterial;
import com.cdm.model.ProjectMaterialExample;
import com.cdm.model.ProjectMaterialKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectMaterialMapper {
    int countByExample(ProjectMaterialExample example);

    int deleteByExample(ProjectMaterialExample example);

    int deleteByPrimaryKey(ProjectMaterialKey key);

    int insert(ProjectMaterial record);

    int insertSelective(ProjectMaterial record);

    List<ProjectMaterial> selectByExample(ProjectMaterialExample example);

    ProjectMaterial selectByPrimaryKey(ProjectMaterialKey key);

    int updateByExampleSelective(@Param("record") ProjectMaterial record, @Param("example") ProjectMaterialExample example);

    int updateByExample(@Param("record") ProjectMaterial record, @Param("example") ProjectMaterialExample example);

    int updateByPrimaryKeySelective(ProjectMaterial record);

    int updateByPrimaryKey(ProjectMaterial record);
}