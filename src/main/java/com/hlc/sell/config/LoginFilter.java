package com.hlc.sell.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/api/*", filterName = "loginFilter")   //拦截规则
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init loginFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String name = request.getParameter("username");
        if ("hl".equals(name)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            response.sendRedirect("/index.html");
        }
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter");
    }
}
