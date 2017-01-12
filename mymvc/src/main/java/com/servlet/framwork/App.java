package com.servlet.framwork;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.servlet.framwork.controller.HelloServlet;
import com.servlet.framwork.controller.HelloServlet2;


@WebListener
public class App implements ServletContextListener {

    private ServletContext ctx;

    public void contextInitialized(ServletContextEvent sce) {
        this.ctx = sce.getServletContext();
        this.ctx.addServlet("helloServlet", HelloServlet.class).addMapping("/hello");
        this.ctx.addServlet("helloServlet2", HelloServlet2.class).addMapping("/abc");
        this.ctx.getRequestDispatcher("");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        
    }


}
