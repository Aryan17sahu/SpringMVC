package com.skytech.dao;

import com.skytech.pojo.AdminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AdminDaoImpl implements AdminDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insertAdmin(AdminModel adminModel) {
        String sql = "insert into admin(userName,password,role,id) values(?,?,?,?)";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(adminModel.getPassword());
        adminModel.setPassword(hashedPassword);


        return jdbcTemplate.update(sql, adminModel.getUserName(), adminModel.getPassword(), adminModel.getRole(), adminModel.getId());

    }

    @Override
    public int updateAdminLoginTime(String userName) {
        String query = "update admin set login_time=? where userName=?";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = LocalDateTime.now().format(dateTimeFormatter);
        System.out.println("Login: " + format);

        return jdbcTemplate.update(query, format, userName);

    }

    @Override
    public int updateAdminLogoutTime(String userName) {
        String query = "update admin set logout_time=? where userName=?";


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = LocalDateTime.now().format(dateTimeFormatter);

        return jdbcTemplate.update(query, format, userName);

    }
}
