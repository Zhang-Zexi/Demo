package com.aqumon.zzx.proxy.staticproxy;

import java.util.logging.Logger;
import java.util.Date;

/**
 * 静态代理类
 */
public class PersonProxy implements IPerson {

    private IPerson person;//接口注入

    private Logger logger = Logger.getLogger("PersonProxy");

    public PersonProxy(IPerson person) {

        this.person = person;

    }

    public void eating() {

        logger.info("开始执行时间:" + new Date());

        person.eating();// 通过接口注入代理

        logger.info("执行结束时间:" + new Date());

    }

    public void sleep() {

        logger.info("开始执行时间:" + new Date());

        person.sleep();

        logger.info("“执行结束时间:" + new Date());

    }

}
