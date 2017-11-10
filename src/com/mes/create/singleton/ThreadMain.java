package com.mes.create.singleton;

/**
 * 一句话描述这个类的作用
 *
 * @author liukl
 * @date 2017/11/9
 */
public class ThreadMain extends Thread {
    public static void main(String[] args) {

        ThreadMain[] mts = new ThreadMain[100];
        for (int i = 0; i < mts.length; i++) {
            mts[i] = new ThreadMain();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }

    }

    @Override
    public void run() {
        System.out.println(SingletonOne.getInstance().hashCode());
    }
}
