package com.mes.create.singleton;

/**
 * 单利版本7
 * 多线程下安全性能高 双检查锁
 *
 * @author liukl
 * @date 2017/11/9
 */
public class SingletonSeven {
    /**
     * 单例对象
     */
    private volatile static SingletonSeven singleton;

    private SingletonSeven() {
    }

    public static SingletonSeven getInstance() {
        try {

            if (singleton != null) {

            } else {
                synchronized (SingletonSeven.class) {
                    Thread.sleep(300);
                    if(singleton==null){
                        singleton = new SingletonSeven();
                    }
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }

}
