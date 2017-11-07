package com.mes.structure.adapter.demo2;

/**
 * 测试类
 */
public class Main {
    public static  void main(String [] args){
        Player p1 =new Forward("巴蒂尔");
        p1.attract();

        Player p2 =new Gurads("巴菲菲特");
        p2.defense();

        Player p3 =new Translation("姚明");
        p3.attract();
        p3.defense();

    }
}
