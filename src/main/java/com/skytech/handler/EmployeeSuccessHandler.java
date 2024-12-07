package com.skytech.handler;

import com.skytech.service.AdminServiceImpl;
import com.skytech.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.Collection;

public class EmployeeSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    EmployeeServiceImpl employeeService;
    @Autowired
    AdminServiceImpl adminService;

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    User principal;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        System.out.println("inside Authentication method");

        if (authentication.isAuthenticated()) {
            try {
//
                principal = (User) authentication.getPrincipal();
                System.out.println(principal);
                int i = adminService.updateAdminLoginTime(principal.getUsername());
                System.out.println("time updated" + i);

            } catch (Exception e) {
                System.out.println("exception coming");
            }

            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            for (GrantedAuthority grantedAuthority : authorities) {
                if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
                    redirectStrategy.sendRedirect(httpServletRequest, httpServletResponse, "/admin");
                } else if (grantedAuthority.getAuthority().equals("ROLE_USER")) {
                    redirectStrategy.sendRedirect(httpServletRequest, httpServletResponse, "/user");
                } else {
                    redirectStrategy.sendRedirect(httpServletRequest, httpServletResponse, "/home");
                }


            }

        }
    }

    public String getUserName() {
        return principal.getUsername();
    }

    public EmployeeServiceImpl getEmployeeService() {

        return employeeService;
    }

    public void setEmployeeService(final EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }
}
