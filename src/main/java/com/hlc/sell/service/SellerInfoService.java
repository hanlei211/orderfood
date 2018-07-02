package com.hlc.sell.service;


import com.hlc.sell.entity.SellerInfo;
import org.springframework.stereotype.Service;

@Service
public interface SellerInfoService {

    int deleteByPrimaryKey(String id);

    int insert(SellerInfo record);

    SellerInfo selectByPrimaryKey(String id);

    int updateByPrimaryKey(SellerInfo record);
}
