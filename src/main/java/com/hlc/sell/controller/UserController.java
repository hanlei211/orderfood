package com.hlc.sell.controller;

import com.hlc.sell.entity.User;
import com.hlc.sell.service.UserSerivce;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Author rjyx
 * @Description
 * @Date create in 2018/6/27
 * @Modify by
 */
@RestController
public class UserController {

    @Resource
    private UserSerivce userService;


    @RequestMapping("/say")
    public String say(){
        return "springboot-a"+userService;
    }

    @RequestMapping("/find")
    public String find(){
        User user =  userService.find("han");
        ModelAndView mav = new ModelAndView();
        mav.addObject("user","sadf");
        return "name"+user.getName()+"--age"+ user.getAge();
    }


    @RequestMapping("/ajax")
    public String find1(){
        return "[''message':'123dfx']";
    }
}
