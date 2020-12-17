package com.aqumon.zzx.proxy.staticproxy;

/**
 * @ClassName PersonBothTest
 * @Description 测试类
 * @Author zhangzx
 * @Date 2019/12/6 17:30
 * Version 1.0
 **/
public class PersonTest {

    public static void main(String[] args) {

        IPerson proxy = new PersonProxy(new Person());

        proxy.eating();

        proxy.sleep();

    }

}