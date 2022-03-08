package com.sxgroup.springhelloword.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloListener  implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContextListener.super.contextInitialized(sce);
        System.out.println("ServletContext 对象创建了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
        System.out.println("ServletContext对象消耗了");
    }
}
