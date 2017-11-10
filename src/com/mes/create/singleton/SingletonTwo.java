package com.mes.create.singleton;

/**
 * 一句话描述这个类的作用
 *
 * @author liukl
 * @date 2017/11/9
 */
public class SingletonTwo {
    private static SingletonTwo singleton = null;

    private SingletonTwo() {
    }

    public static SingletonTwo getInstance() {
        if (singleton == null) {
            singleton = new SingletonTwo();
        }
        return singleton;
    }

}
