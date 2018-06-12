package com.hlc.sell.controller;


import com.hlc.sell.entity.OrderMaster;
import com.hlc.sell.service.OrderMasterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

@Controller
@RequestMapping("/buyer/order")
@Slf4j
@EnableAutoConfiguration
public class BuyerOrderController {

    @Autowired
    private OrderMasterService orderMasterService;

    //创建订单
    @RequestMapping("/create")
    public String create(HttpServletRequest request, Model model) {
        OrderMaster orderMaster = new OrderMaster();
        if (orderMaster == null) {
            log.error("【创建订单】购物车不能为空");
        }
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("师兄");
        orderMaster.setBuyerPhone("123456789123");
        orderMaster.setBuyerAddress("幕课网");
        orderMaster.setBuyerOpenid("111111111111111111111");
        orderMaster.setOrderAmount(new BigDecimal(2.5));

        int code = orderMasterService.createOrder(orderMaster);
        if (code > 0) {
            orderMasterService.selectByPrimaryKey("1234567");
        }
        return "success!";
    }
}
