package com.cdm.model;

import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public class Project {
    private Integer projectId;

    private Integer workerId;

    private Integer locationId;

    private String projectTitle;

    private Float projectBudget;

    private Date projectStartDate;

    private Date projectEndDate;

    private String projectDesc;

    private String projectBaseUrl;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle == null ? null : projectTitle.trim();
    }

    public Float getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(Float projectBudget) {
        this.projectBudget = projectBudget;
    }

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Date getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc == null ? null : projectDesc.trim();
    }

    public String getProjectBaseUrl() {
        return projectBaseUrl;
    }

    public void setProjectBaseUrl(String projectBaseUrl) {
        this.projectBaseUrl = projectBaseUrl == null ? null : projectBaseUrl.trim();
    }
}