package com.mes.behavior.state;

/**
 * 状态测试类
 *
 * @author liukl
 * @date 2017/11/9
 */
public class Main {
    public static void main(String [] args){
        Work work=new Work();
        work.setHour(9);
        work.writeCode();
        work.setHour(13);
        work.writeCode();
    }
}
