package com.hlc.sell.service;


import com.hlc.sell.entity.OrderMaster;

public interface OrderMasterService {

    int createOrder(OrderMaster orderMaster);

    OrderMaster selectByPrimaryKey(String orderId);
}
