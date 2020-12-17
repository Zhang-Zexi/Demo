package com.aqumon.zzx.proxy.staticproxy;

/**
 * @ClassName Person
 * @Description
 * @Author zhangzx
 * @Date 2019/12/6 17:28
 * Version 1.0
 **/
public class Person implements IPerson {

    public void sleep(){

        System.out.println("睡觉中");

    }

    public void eating(){

        System.out.println("正在吃饭中");

    }

}
