package com.mes.create.singleton;

/**
 * 单利版本4
 * 性能比较高只同步关键代码(可能线程不安全)
 *
 * @author liukl
 * @date 2017/11/9
 */
public class SingletonFive {
    /**
     * 单例对象
     */
    private static SingletonFive singleton;

    private SingletonFive() {
    }

    public static SingletonFive getInstance() {
        try {

            if (singleton != null) {

            } else {
                Thread.sleep(300);
                synchronized (SingletonFive.class) {
                    singleton = new SingletonFive();
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }
}
