package com.skytech.service;

import com.skytech.dao.AdminDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDaoImpl adminDao;

    @Override
    public int updateAdminLoginTime(String userName) {
        return adminDao.updateAdminLoginTime(userName);
    }
}
