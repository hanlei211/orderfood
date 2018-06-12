package com.hlc.sell.mapper;

import com.hlc.sell.entity.OrderDetail;
import com.hlc.sell.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailMapper extends MyMapper<OrderDetail> {

    int deleteByPrimaryKey(String detailId);

    int insert(OrderDetail record);

    OrderDetail selectByPrimaryKey(String detailId);

    int updateByPrimaryKey(OrderDetail record);
}