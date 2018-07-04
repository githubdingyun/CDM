package com.cdm.model;

import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public class Message {
    private Integer messageId;

    private Integer subjectId;

    private String content;

    private Integer sender;

    private Byte sendDelete;

    private Byte sendStatus;

    private Date saveTime;

    private Date sendTime;

    private Date sendUpdateTime;

    private Integer receiver;

    private Byte receiveDelete;

    private Byte receiveStatus;

    private Date receiveUpdateTime;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public Byte getSendDelete() {
        return sendDelete;
    }

    public void setSendDelete(Byte sendDelete) {
        this.sendDelete = sendDelete;
    }

    public Byte getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Byte sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getSendUpdateTime() {
        return sendUpdateTime;
    }

    public void setSendUpdateTime(Date sendUpdateTime) {
        this.sendUpdateTime = sendUpdateTime;
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    public Byte getReceiveDelete() {
        return receiveDelete;
    }

    public void setReceiveDelete(Byte receiveDelete) {
        this.receiveDelete = receiveDelete;
    }

    public Byte getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(Byte receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public Date getReceiveUpdateTime() {
        return receiveUpdateTime;
    }

    public void setReceiveUpdateTime(Date receiveUpdateTime) {
        this.receiveUpdateTime = receiveUpdateTime;
    }
}