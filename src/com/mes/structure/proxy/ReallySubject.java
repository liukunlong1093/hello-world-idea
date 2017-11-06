package com.mes.structure.proxy;

public class ReallySubject implements Subject {
    @Override
    public void request() {
        String msg="发起的请求.";
        System.out.println("-----------ftdsoft.com-----------值=" + msg+ "," + "当前类=ReallySubject.request()");
    }
}
