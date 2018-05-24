package org.mavenssm.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mavenssm.entity.Admin;
import org.mavenssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
//配置spring和junit整合，junit启动时加载springioc容器,用到的依赖有spring-test junit
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring 配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class AdminServiceImplTest {
    @Autowired
    private AdminServiceImpl adminServiceImpl;
    @Test
    public void checkLogin() throws Exception {
        String username="jw";
        String password="jw";
        Admin admin= adminServiceImpl.CheckLogin(username,password);
        System.out.println(admin);
    }
}
//经测试在service以及对应的实现类都可以正常测试