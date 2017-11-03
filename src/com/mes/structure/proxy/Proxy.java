package com.mes.structure.proxy;

public class Proxy implements Subject{
    private ReallySubject reallySubject;

    public Proxy() {
        reallySubject=new ReallySubject();
    }

    @Override
    public void request() {
        before();
        reallySubject.request();
    }

    public void before(){
        String msg="我是代理ReallySubject";
        System.out.println("-----------ftdsoft.com-----------值=" +msg+ "," + "当前类=Proxy.before()");
    }
}
