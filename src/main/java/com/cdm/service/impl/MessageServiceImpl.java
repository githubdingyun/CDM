package com.cdm.service.impl;

import com.cdm.dao.MessageMapper;
import com.cdm.model.Message;
import com.cdm.model.MessageExample;
import com.cdm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class MessageServiceImpl implements BaseService<Message,MessageExample> {
    @Autowired
    MessageMapper messageMapper;

    public int countByExample(MessageExample example) {
        return messageMapper.countByExample(example);
    }

    public int deleteByExample(MessageExample example) {
        return messageMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer messageId) {
        return messageMapper.deleteByPrimaryKey(messageId);
    }

    public int insert(Message record) {
        return messageMapper.insert(record);
    }

    public int insertSelective(Message record) {
        return messageMapper.insertSelective(record);
    }

    public List<Message> selectByExample(MessageExample example) {
        return messageMapper.selectByExample(example);
    }

    public Message selectByPrimaryKey(Integer messageId) {
        return messageMapper.selectByPrimaryKey(messageId);
    }

    public int updateByExampleSelective(Message record, MessageExample example) {
        return messageMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(Message record, MessageExample example) {
        return messageMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Message record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Message record) {
        return messageMapper.updateByPrimaryKey(record);
    }
}
