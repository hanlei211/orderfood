package com.hlc.sell.service;

import com.github.pagehelper.Page;
import com.hlc.sell.entity.LearnResource;

import java.util.Map;

/**
 * @Author rjyx
 * @Description
 * @Date create in 2018/7/18
 * @Modify by
 */
public interface LearnService {

    int add(LearnResource learnResource);

    int update(LearnResource learnResource);

    int deleteByIds(String ids);

    LearnResource queryLearnResouceById(Long learnResource);

    Page queryLearnResouceList(Map<String, Object> params);
}
