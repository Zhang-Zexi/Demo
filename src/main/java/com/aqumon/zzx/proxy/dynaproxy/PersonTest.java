package com.aqumon.zzx.proxy.dynaproxy;

import com.aqumon.zzx.proxy.staticproxy.Person;
import com.aqumon.zzx.proxy.staticproxy.IPerson;

/**
 * @ClassName PersonBothTest
 * @Description 动态代理测试类
 * @Author zhangzx
 * @Date 2019/12/6 17:52
 * Version 1.0
 **/
public class PersonTest {

    public static void main(String[] args) {

        IPerson person = (IPerson) DynaProxyFactory.getProxy(new Person());

        //返回代理类,代理类是JVM在内存中动态创建的,该类实现传入的接口数组的全部接口(的全部方法).

        person.eating();

        person.sleep();

    }
}