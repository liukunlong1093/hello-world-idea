package com.mes.create.singleton;

/**
 * 单利版本4
 * 多线程下安全性能不高
 *
 * @author liukl
 * @date 2017/11/9
 */
public class SingletonSix {
    /**
     * 单例对象
     */
    private static SingletonSix singleton;

    private SingletonSix() {
    }

    public  static SingletonSix getInstance() {
        try {
            synchronized(SingletonSix.class){
                if (singleton != null) {

                } else {
                    Thread.sleep(300);

                    singleton = new SingletonSix();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }

}
