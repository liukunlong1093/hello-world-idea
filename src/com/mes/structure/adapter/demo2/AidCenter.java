package com.mes.structure.adapter.demo2;

/**
 * 中锋
 */
public class AidCenter {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println(this.name + ":中锋进攻");
    }

    public void 防守() {
        System.out.println(this.name + ":中锋防守");
    }
}
