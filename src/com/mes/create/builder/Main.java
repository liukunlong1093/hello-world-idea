package com.mes.create.builder;

/**
 * 一句话描述这个类的作用
 *
 * @author liukl
 * @date 2017/11/14
 */
public class Main {
    public static void main(String [] args){
        ComputerBuilder com=new ThinkPadComputer();
        ComputerDirector computerDirector=new ComputerDirector(com);
        computerDirector.createComputer();
    }
}
