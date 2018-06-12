package com.hlc.sell.mapper;


import com.hlc.sell.entity.OrderMaster;
import com.hlc.sell.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMasterMapper extends MyMapper<OrderMaster> {


    int deleteByPrimaryKey(String orderId);

    int insert(OrderMaster record);

    OrderMaster selectByPrimaryKey(String orderId);

    int updateByPrimaryKey(OrderMaster record);
}