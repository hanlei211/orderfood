package com.hlc.sell.service.impl;

import com.github.pagehelper.Page;
import com.hlc.sell.entity.LearnResource;
import com.hlc.sell.mapper.LearnMapper;
import com.hlc.sell.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author rjyx
 * @Description
 * @Date create in 2018/7/18
 * @Modify by
 */
@Service
public class LearnServiceImpl implements LearnService {

    @Autowired
    public LearnMapper learnMapper;

    @Override
    public int add(LearnResource learnResource) {
        return learnMapper.add(learnResource);
    }

    @Override
    public int update(LearnResource learnResource) {
        return learnMapper.update(learnResource);
    }

    @Override
    public int deleteByIds(String ids) {
        return learnMapper.deleteByIds(ids);
    }

    @Override
    public LearnResource queryLearnResouceById(Long learnResource) {
        return learnMapper.queryLearnResouceById(learnResource);
    }

    @Override
    public Page queryLearnResouceList(Map<String, Object> params) {
        return learnMapper.queryLearnResouceList(params);
    }
}
