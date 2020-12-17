package com.aqumon.zzx.proxy.dynamicproxy_cglib;

/**
 * @ClassName DaoProxy
 * @Description
 * @Author zhangzx
 * @Date 2020/1/13 19:33
 * Version 1.0
 **/
public class DaoProxy implements Dao {

    @Override
    public void select() {
        System.out.println("查询 selectById");
    }

    @Override
    public void update() {
        System.out.println("更新 update");
    }

}
