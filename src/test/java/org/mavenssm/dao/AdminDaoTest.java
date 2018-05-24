package org.mavenssm.dao;

import org.junit.runner.RunWith;
import org.mavenssm.entity.Admin;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//配置spring和junit整合，junit启动时加载springioc容器,用到的依赖有spring-test junit
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring 配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class AdminDaoTest {
    //注入Dao依赖才能运用
    @Resource
    private AdminDao adminDao;

    @org.junit.Test
    public void queryAdmin() throws Exception {
        String username="jw";
        String password="jw";
        Admin admin=adminDao.queryAdmin(username,password);
        System.out.println("管理员名字： "+admin.getAdminName());
        System.out.print(admin);
     /*
      如果数据库字段username与bean中的属性值不对应,而且配置文件中不做映射处理的话会遇到为空的情况

      管理员名字： null
        Admin{id=1, adminName='null', password='jw'}*/
       /*
       改为adminName字段一entity一直，正常输出
       管理员名字： jw
        Admin{id=1, adminName='jw', password='jw'}*/
    }

}