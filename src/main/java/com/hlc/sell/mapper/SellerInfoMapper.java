package com.hlc.sell.mapper;


import com.hlc.sell.entity.SellerInfo;
import com.hlc.sell.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellerInfoMapper extends MyMapper<SellerInfo> {

    int deleteByPrimaryKey(String id);

    int insert(SellerInfo record);

    SellerInfo selectByPrimaryKey(String id);

    int updateByPrimaryKey(SellerInfo record);
}