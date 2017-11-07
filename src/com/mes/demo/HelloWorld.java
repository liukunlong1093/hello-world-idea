package com.mes.demo;

/**
 * HelloWorld IDEA 测试类
 */
public class HelloWorld {
    public  static void main(String[] args){
        Demo demo=new Demo();
        demo.setId("1");
        demo.setName("小花花花");
        System.out.println("我爱你：HelloWorld");
        System.out.println("-----------ftdsoft.com-----------值=" +demo.toString()+ "," + "当前类=HelloWorld.Main()");

    }
}
