package org.mavenssm.entity;

public class Admin {
    private  int id;
    private  String  adminName;//管理员名称
    private  String  password;//密码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//重写toString方便打印输出
    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", adminName='" + adminName + '\'' + ", password='" + password + '\'' + '}';
    }
}
