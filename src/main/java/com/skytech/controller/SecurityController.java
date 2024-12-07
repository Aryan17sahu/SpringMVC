package com.skytech.controller;

import com.skytech.dao.AdminDaoImpl;
import com.skytech.dao.EmployeeDaoImpl;
import com.skytech.handler.EmployeeSuccessHandler;
import com.skytech.pojo.AdminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Controller
public class SecurityController {
    @Autowired
    AdminDaoImpl adminDao;

    @Autowired
    EmployeeSuccessHandler employeeSuccessHandler;

    @RequestMapping("/test")
    public String check() {

        return "Checking test";
    }

    @RequestMapping("/test1")
    public String check1() {

        return "Checking test1";
    }

    @RequestMapping("/test2")
    public String check2() {

        return "Checking test2";
    }

    @RequestMapping("/test3")
    public String check3() {

        return "Checking test3";
    }

    @RequestMapping("/loginForm")
    public String adminRegisterForm(Model model) {
        model.addAttribute("admin", new AdminModel());
        return "adminRegisterForm";
    }

    @RequestMapping("saveAdmin")
    @ResponseBody
    public String saveAdminDetails(@ModelAttribute("admin") AdminModel adminModel) {


        adminDao.insertAdmin(adminModel);

        return "saved";
    }

    @GetMapping(value = "/signIn")
    public String login() {

        return "login1";
    }

    @RequestMapping("/loginError")
    public String loginError(Model model) {
        model.addAttribute("error", "true");
        model.addAttribute("msg", "Invalid credentials try again");

        return "login1";
    }

    @RequestMapping("/logOut1")
    public String logout( Model model) {
        model.addAttribute("logOutMsg", "Logout Successfully ");
        System.out.println("<------------------------Logout Method--------------------------------->");
        String userName = employeeSuccessHandler.getUserName();
//        System.out.println(userName);
        adminDao.updateAdminLogoutTime(userName);

        return "login1";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String admin() {

        return "Admin login";
    }
    @RequestMapping("/user")
    @ResponseBody
    public String user() {

        return "User login";
    }


}
