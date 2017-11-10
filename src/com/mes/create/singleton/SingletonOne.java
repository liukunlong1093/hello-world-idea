package com.mes.create.singleton;

/**
 * 单利版本1
 * 多线程并发情况下可能会有多个实例出现
 *
 * @author liukl
 * @date 2017/11/9
 */
public class SingletonOne {
    /**
     * 单例对象
     */
    private static SingletonOne singleton;

    private SingletonOne() {
    }

    public static SingletonOne getInstance() {
        try {
            if (singleton != null) {

            } else {
                Thread.sleep(300);

                singleton = new SingletonOne();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }
}
