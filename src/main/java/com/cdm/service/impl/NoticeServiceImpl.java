package com.cdm.service.impl;

import com.cdm.dao.NoticeMapper;
import com.cdm.model.Notice;
import com.cdm.model.NoticeExample;
import com.cdm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class NoticeServiceImpl implements BaseService<Notice,NoticeExample> {
    @Autowired
    NoticeMapper noticeMapper;

    public int countByExample(NoticeExample example) {
        return noticeMapper.countByExample(example);
    }

    public int deleteByExample(NoticeExample example) {
        return noticeMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer noticeId) {
        return noticeMapper.deleteByPrimaryKey(noticeId);
    }

    public int insert(Notice record) {
        return noticeMapper.insert(record);
    }

    public int insertSelective(Notice record) {
        return noticeMapper.insertSelective(record);
    }

    public List<Notice> selectByExample(NoticeExample example) {
        return noticeMapper.selectByExample(example);
    }

    public Notice selectByPrimaryKey(Integer noticeId) {
        return noticeMapper.selectByPrimaryKey(noticeId);
    }

    public int updateByExampleSelective(Notice record, NoticeExample example) {
        return noticeMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(Notice record, NoticeExample example) {
        return noticeMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Notice record) {
        return noticeMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Notice record) {
        return noticeMapper.updateByPrimaryKey(record);
    }
}
