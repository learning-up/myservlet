package com.servlet.framwork.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns="/*")
public class TestFilter implements Filter {

    public TestFilter() {
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
       
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        System.out.println("aa");
        
        chain.doFilter(request, response);

    }

    public void destroy() {
        // TODO Auto-generated method stub

    }

}
