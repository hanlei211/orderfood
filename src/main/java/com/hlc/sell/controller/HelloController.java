package com.hlc.sell.controller;

import com.hlc.sell.config.DruidConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/index")
   private  String  index(){
        return "index";
    }

    @RequestMapping("/indexindex")
    private  String  index1(){
        return "index";
    }


}
