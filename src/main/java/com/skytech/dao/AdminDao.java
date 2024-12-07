package com.skytech.dao;

import com.skytech.pojo.AdminModel;

public interface AdminDao {
    public int insertAdmin(AdminModel adminModel);
    public int updateAdminLoginTime(String userName);

    public int updateAdminLogoutTime(String userName);
}
