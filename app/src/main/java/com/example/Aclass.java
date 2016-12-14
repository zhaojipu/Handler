package com.example;

/**
 * Created by zhaojipu on 2016/11/29.
 */

public class Aclass {
    public static int a=6;
    static {
        System.out.println("wwwwwwww");
    }
    {
        System.out.println("222222");
    }

    public int sum(int a,int b){
        return a+b;
    }
}
