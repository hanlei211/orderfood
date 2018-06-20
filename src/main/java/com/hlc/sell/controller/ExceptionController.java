package com.hlc.sell.controller;

import com.hlc.sell.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @RequestMapping(value = "/api/test")
    public  Object index(){
//        int  i=1/0;
        throw new MyException("500","myException异常");
    }
}
