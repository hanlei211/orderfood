package com.hlc.sell.service;


import com.hlc.sell.entity.OrderMaster;
import org.springframework.stereotype.Service;

@Service
public interface OrderMasterService {

    int createOrder(OrderMaster orderMaster);

    OrderMaster selectByPrimaryKey(String orderId);
}
