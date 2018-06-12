package com.hlc.sell.service.impl;

import com.hlc.sell.entity.OrderMaster;
import com.hlc.sell.mapper.OrderMasterMapper;
import com.hlc.sell.service.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderMasterServiceImpl implements OrderMasterService {

    @Autowired
    public OrderMasterMapper orderMasterMapper;


    @Override
    public int createOrder(OrderMaster orderMaster) {
        return orderMasterMapper.insert(orderMaster);
    }

    @Override
    public OrderMaster selectByPrimaryKey(String orderId) {
        return orderMasterMapper.selectByPrimaryKey(orderId);
    }
}
