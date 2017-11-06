package com.mes.structure.adapter.demo2;

/**
 * 中锋
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attract() {
        System.out.println(this.name+":中锋进攻");
    }

    @Override
    public void defense() {
        System.out.println(this.name+":中锋防守");
    }
}
