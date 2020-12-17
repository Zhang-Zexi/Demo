package com.aqumon.zzx.proxy;

import org.apache.log4j.Logger;
import java.util.Date;

/**
 * @ClassName Person1
 * @Description 一般类添加日志
 * @Author zhangzx
 * @Date 2019/12/6 17:26
 * Version 1.0
 **/
public class Person1 {

    private Logger logger = Logger.getLogger(Person1.class);

    public void sleep(){

        logger.info("开始执行时间:" + new Date());

        System.out.println("睡觉中");

        logger.info("执行结束时间:" + new Date());

    }

    public void eating(){

        logger.info("开始执行时间:“ + new Date()");

        System.out.println("正在吃饭中");

        logger.info("“执行结束时间:” + new Date()");

    }

}
