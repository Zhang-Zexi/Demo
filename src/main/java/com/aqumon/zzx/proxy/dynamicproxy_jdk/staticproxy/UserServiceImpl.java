package com.aqumon.zzx.proxy.dynamicproxy_jdk.staticproxy;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author zhangzx
 * @Date 2020/1/13 18:44
 * Version 1.0
 **/
public class UserServiceImpl implements UserService {

    @Override
    public void select() {
        System.out.println("查询 selectById");
    }

    @Override
    public void update() {
        System.out.println("更新 update");
    }

}
