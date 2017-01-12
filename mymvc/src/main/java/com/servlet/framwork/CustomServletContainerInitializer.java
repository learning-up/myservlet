package com.servlet.framwork;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import com.servlet.framwork.controller.HelloServlet;

//暂时不好使，待调
// @HandlesTypes(value = {HttpServlet.class})
public class CustomServletContainerInitializer implements ServletContainerInitializer {

    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {

        ctx.addServlet("helloServlet", HelloServlet.class).addMapping("/hello");

    }

}
