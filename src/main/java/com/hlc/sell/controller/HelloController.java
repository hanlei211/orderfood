package com.hlc.sell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

    @RequestMapping("/index")
   private  String  index(){
        return "index";
    }

    @RequestMapping("/indexindex")
    private  String  index1(){
        return "index";
    }

    @RequestMapping("/api/hello")
    private  String  index2(){
        return "hello";
    }

    @RequestMapping("/count")
    @ResponseBody
    public  String getCount(HttpServletRequest request, HttpServletResponse response){
        HttpSession session= request.getSession();
        Object count  = session.getServletContext().getAttribute("count");
        return  "访问次数是" + count;
    }

}
