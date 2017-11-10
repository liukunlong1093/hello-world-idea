package com.mes.create.singleton;

/**
 * 单利版本4
 * 多线程下安全性能不高
 *
 * @author liukl
 * @date 2017/11/9
 */
public class SingletonFour {
    /**
     * 单例对象
     */
    private static SingletonFour singleton;

    private SingletonFour() {
    }

    public synchronized  static SingletonFour getInstance() {
        try {
            if (singleton != null) {

            } else {
                Thread.sleep(300);

                singleton = new SingletonFour();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }
}
