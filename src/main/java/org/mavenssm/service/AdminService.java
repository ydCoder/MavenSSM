package org.mavenssm.service;

import org.mavenssm.entity.Admin;



public interface AdminService {
    // 通过用户名及密码核查用户登录
    Admin CheckLogin(String username, String password);
}
