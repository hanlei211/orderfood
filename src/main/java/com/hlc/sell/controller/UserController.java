package com.hlc.sell.controller;

import com.hlc.sell.entity.User;
import com.hlc.sell.service.UserService;
import com.hlc.sell.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * @Author rjyx
 * @Description
 * @Date create in 2018/6/27
 * @Modify by
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/say")
    public String say() {
        return "springboot-a" + userService;
    }

    @RequestMapping("/find")
    @ResponseBody
    public String find() {
        User user = userService.find("sz");
        ModelAndView mav = new ModelAndView();
        mav.addObject("user", "sadf");
        return "name:" + user.getName() + "--age:" + user.getAge();
    }

    @RequestMapping("/update")
    @ResponseBody
    public void update() {
        userService.update(new User("sz", "26"));
    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insert() {
        User user = new User("sz", "25");
        return userService.insert(user);
    }


    @RequestMapping("/ajax")
    public String find1() {
        return "['message':'123dfx']";
    }
}
