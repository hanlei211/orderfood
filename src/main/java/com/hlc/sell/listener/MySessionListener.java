package com.hlc.sell.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//监听器统计在线人数
@WebListener
public class MySessionListener implements HttpSessionListener {
    public  int count = 0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("sessionCreated");
        count++;
        httpSessionEvent.getSession().getServletContext().setAttribute("count",count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("sessionDestroyed");
        count--;
        httpSessionEvent.getSession().getServletContext().setAttribute("count", count);
    }
}
