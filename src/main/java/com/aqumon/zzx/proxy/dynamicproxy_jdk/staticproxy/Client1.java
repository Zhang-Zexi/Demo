package com.aqumon.zzx.proxy.dynamicproxy_jdk.staticproxy;

/**
 * @ClassName Client1
 * @Description
 * @Author zhangzx
 * @Date 2020/1/13 18:47
 * Version 1.0
 **/
public class Client1 {
    public static void main(String[] args) {

        UserService userServiceImpl = new UserServiceImpl();
        UserService proxy = new UserServiceProxy(userServiceImpl);

        proxy.select();
        proxy.update();
    }
}
