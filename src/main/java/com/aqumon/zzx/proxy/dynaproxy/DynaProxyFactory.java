package com.aqumon.zzx.proxy.dynaproxy;

import java.lang.reflect.Proxy;
/**
 * @ClassName DynaProxyFactory
 * @Description 动态代理工厂
 * @Author zhangzx
 * @Date 2019/12/6 17:50
 * Version 1.0
 **/
public class DynaProxyFactory {

    //obj为被代理对象

    public static Object getProxy(Object obj){

        DynaProxyHandler handler = new DynaProxyHandler();

        handler.setTarget(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);

    }
}
