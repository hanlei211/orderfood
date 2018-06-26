package com.hlc.sell.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CustomerException {
    private  static  final  Logger  logger = LoggerFactory.getLogger(CustomerException.class);


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    Object handleException(Exception e, HttpServletRequest request){
        logger.error("url{},msg{}",request.getRequestURL(),e.getMessage());
        Map<String,Object>  map = new HashMap<>();
        map.put("code",100);
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }

    @ExceptionHandler(value = MyException.class)
    Object handleMyException(Exception e,HttpServletRequest request){
        ModelAndView  modelAndView = new ModelAndView();
        modelAndView.setViewName("error.html");
        modelAndView.addObject("url",request.getRequestURL());
        modelAndView.addObject("msg",e.getMessage());
        return modelAndView;
    }
}
