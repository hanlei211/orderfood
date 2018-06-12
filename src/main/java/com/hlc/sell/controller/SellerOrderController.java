package com.hlc.sell.controller;


import com.hlc.sell.service.SellerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seller/order")
@Slf4j
@EnableAutoConfiguration
public class SellerOrderController {

    @Autowired
    private SellerInfoService sellerInfoService;


}
