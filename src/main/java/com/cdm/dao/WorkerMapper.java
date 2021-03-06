package com.cdm.dao;

import com.cdm.model.Worker;
import com.cdm.model.WorkerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerMapper {
    int countByExample(WorkerExample example);

    int deleteByExample(WorkerExample example);

    int deleteByPrimaryKey(Integer workerId);

    int insert(Worker record);

    int insertSelective(Worker record);

    List<Worker> selectByExample(WorkerExample example);

    Worker selectByPrimaryKey(Integer workerId);

    int updateByExampleSelective(@Param("record") Worker record, @Param("example") WorkerExample example);

    int updateByExample(@Param("record") Worker record, @Param("example") WorkerExample example);

    int updateByPrimaryKeySelective(Worker record);

    int updateByPrimaryKey(Worker record);
}