package com.cdm.model;

import org.springframework.stereotype.Repository;

@Repository
public class Worker {
    private Integer workerId;

    private Integer subjectId;

    private String workerName;

    private String workerPassword;

    private Integer workerLeader;

    private Integer workerAge;

    private String workerImgUrl;

    private String workerDesc;

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }

    public String getWorkerPassword() {
        return workerPassword;
    }

    public void setWorkerPassword(String workerPassword) {
        this.workerPassword = workerPassword == null ? null : workerPassword.trim();
    }

    public Integer getWorkerLeader() {
        return workerLeader;
    }

    public void setWorkerLeader(Integer workerLeader) {
        this.workerLeader = workerLeader;
    }

    public Integer getWorkerAge() {
        return workerAge;
    }

    public void setWorkerAge(Integer workerAge) {
        this.workerAge = workerAge;
    }

    public String getWorkerImgUrl() {
        return workerImgUrl;
    }

    public void setWorkerImgUrl(String workerImgUrl) {
        this.workerImgUrl = workerImgUrl == null ? null : workerImgUrl.trim();
    }

    public String getWorkerDesc() {
        return workerDesc;
    }

    public void setWorkerDesc(String workerDesc) {
        this.workerDesc = workerDesc == null ? null : workerDesc.trim();
    }
}