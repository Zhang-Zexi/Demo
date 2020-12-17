package com.aqumon.zzx.fatherandboy;

/**
 * @ClassName Daughter
 * @Description
 * @Author zhangzx
 * @Date 2019/11/27 14:43
 * Version 1.0
 **/
public class Daughter implements Mother {

    public static void main(String[] args) {
        Mother mother = new Father();
        String result = ((Father) mother).work();
        System.out.println(result);
    }
}
