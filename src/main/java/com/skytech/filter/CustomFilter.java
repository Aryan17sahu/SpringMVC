package com.skytech.filter;

import javax.servlet.*;
import java.io.IOException;


public class CustomFilter implements   Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("inside custom filter");

        filterChain.doFilter(servletRequest, servletResponse);


    }
}
