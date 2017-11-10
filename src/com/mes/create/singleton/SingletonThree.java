package com.mes.create.singleton;

/**
 * 一句话描述这个类的作用
 *
 * @author liukl
 * @date 2017/11/9
 */
public class SingletonThree {
    private static SingletonThree singleton =new SingletonThree();
    private SingletonThree(){

    }
    public static SingletonThree getInstance(){
        return singleton;
    }
}
