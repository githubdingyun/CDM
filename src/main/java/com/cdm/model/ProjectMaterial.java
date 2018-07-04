package com.cdm.model;

import org.springframework.stereotype.Repository;

@Repository
public class ProjectMaterial extends ProjectMaterialKey {
    private Integer projectMaterialNum;

    private String projectMaterialDesc;

    public Integer getProjectMaterialNum() {
        return projectMaterialNum;
    }

    public void setProjectMaterialNum(Integer projectMaterialNum) {
        this.projectMaterialNum = projectMaterialNum;
    }

    public String getProjectMaterialDesc() {
        return projectMaterialDesc;
    }

    public void setProjectMaterialDesc(String projectMaterialDesc) {
        this.projectMaterialDesc = projectMaterialDesc == null ? null : projectMaterialDesc.trim();
    }
}