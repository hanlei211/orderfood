package com.hlc.sell.mapper;


import com.hlc.sell.entity.ProductInfo;
import com.hlc.sell.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductInfoMapper extends MyMapper<ProductInfo> {

    int deleteByPrimaryKey(String productId);

    int insert(ProductInfo record);

    ProductInfo selectByPrimaryKey(String productId);

    int updateByPrimaryKey(ProductInfo record);
}