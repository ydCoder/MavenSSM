package org.mavenssm.service.impl;

import org.mavenssm.dao.AdminDao;
import org.mavenssm.entity.Admin;
import org.mavenssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//spring提供的注解：component   代表所有注解，
// 不知道是什么角色时使用，如果明确，表明@Service @Dao @Controller
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    //注入service依赖  @Autowired    @Resource
    @Autowired
    private AdminDao adminDao;
    public Admin CheckLogin(String username, String password){

        return adminDao.queryAdmin(username,password);

    }

}
