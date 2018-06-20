package com.hlc.sell.controller;

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

    @RequestMapping("/hello")
    private  String  index2(){
        return "hello";
    }


}
