package com.mes.structure.adapter.demo1;

/**
 * 需要适配的类
 */
public class Adaptee {
    public void specialRequest(){
        String msg="特殊请求";
        System.out.println("-----------ftdsoft.com-----------值=" +msg+ "," + "当前类=Adaptee.specialRequest()");
    }
}
