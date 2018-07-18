package com.hlc.sell.mapper;

import com.github.pagehelper.Page;
import com.hlc.sell.entity.LearnResource;
import com.hlc.sell.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @Author rjyx
 * @Description
 * @Date create in 2018/7/18
 * @Modify by
 */
@Mapper
public interface LearnMapper extends MyMapper<LearnResource> {


    int add(LearnResource learnResource);

    int update(LearnResource learnResource);

    int deleteByIds(String ids);

    LearnResource queryLearnResouceById(Long learnResource);

    Page queryLearnResouceList(Map<String, Object> params);
}
