package com.aqumon.zzx.proxy.dynamicproxy_cglib;

/**
 * @ClassName UserDao
 * @Description
 * @Author zhangzx
 * @Date 2020/1/13 19:21
 * Version 1.0
 **/
public class UserDao {
    public void select() {
        System.out.println("UserDao 查询 selectById");
    }
    public void update() {
        System.out.println("UserDao 更新 update");
    }
}
