package com.sxgroup.springhelloword.servlet;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(filterName = "helloFilter" ,urlPatterns = "/helloServlet")
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行了前面代码"); //放行执行目标资源：HelloServlet
         filterChain.doFilter(servletRequest, servletResponse);
         System.out.println("执行了后面代码");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
