package com.hlc.sell.mapper;

import com.hlc.sell.entity.ProductCategory;
import com.hlc.sell.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductCategoryMapper extends MyMapper<ProductCategory> {

    int deleteByPrimaryKey(Integer categoryId);

    int insert(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKey(ProductCategory record);
}