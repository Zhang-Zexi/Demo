//package com.aqumon.zzx.proxy.dynamicproxy_cglib;
//
//import net.sf.cglib.proxy.Callback;
//import net.sf.cglib.proxy.Enhancer;
///**
// * @ClassName CglibTest
// * @Description 测试类
// * @Author zhangzx
// * @Date 2020/1/13 19:31
// * Version 1.0
// **/
//public class CglibTest {
//    public static void main(String[] args) {
//        DaoProxy daoProxy = new DaoProxy();
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(Dao.class);  // 设置超类，cglib是通过继承来实现的
//        enhancer.setCallback((Callback) daoProxy);
//
//        Dao dao = (Dao)enhancer.create();   // 创建代理类
//        dao.update();
//        dao.select();
//    }
//}
