package com.aqumon.zzx.test;

import com.alibaba.fastjson.JSON;
import com.aqumon.zzx.list.Product;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangzx
 * @description 空集合get是否报错
 * @date 2020/12/17 11:14
 */
public class IsNullObjectTest {

    @Test
    public void test() {
        List<Product> arrayList = new ArrayList<Product>();
//        Integer price = arrayList.get(0).getPrice();
        Product price = arrayList.get(0);
//        System.out.println(JSON.toJSONString(arrayList.get(0), true));
    }
}
