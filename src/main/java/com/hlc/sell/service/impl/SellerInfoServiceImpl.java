package com.hlc.sell.service.impl;


import com.hlc.sell.entity.SellerInfo;
import com.hlc.sell.mapper.SellerInfoMapper;
import com.hlc.sell.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SellerInfoServiceImpl implements SellerInfoService {

    @Autowired
    public SellerInfoMapper sellerMapper;


    @Override
    public int deleteByPrimaryKey(String id) {
        return sellerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SellerInfo record) {
        return sellerMapper.insert(record);
    }

    @Override
    public SellerInfo selectByPrimaryKey(String id) {
        return sellerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(SellerInfo record) {
        return sellerMapper.updateByPrimaryKey(record);
    }
}
