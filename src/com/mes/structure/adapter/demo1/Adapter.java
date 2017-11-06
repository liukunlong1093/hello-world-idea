package com.mes.structure.adapter.demo1;

/**
 * 特殊请求
 */
public class Adapter implements Traget{
    private Adaptee adaptee=new Adaptee();
    @Override
    public void Request() {
        adaptee.specialRequest();
    }
}
