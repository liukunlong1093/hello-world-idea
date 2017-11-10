package com.mes.create.singleton;

/**
 * 一句话描述这个类的作用
 *
 * @author liukl
 * @date 2017/11/9
 */
public class Main {
    public static void main(String[] args){
        int number=11;
        for(int i=0;i<number;i++){
            SingletonOne one=SingletonOne.getInstance();
            System.out.println(one.toString());
        }

    }
}
