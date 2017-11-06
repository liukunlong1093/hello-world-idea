package com.mes.structure.adapter.demo2;

/**
 * 后卫
 */
public class Gurads extends Player {
    public Gurads(String name) {
        super(name);
    }

    @Override
    public void attract() {
        System.out.println(this.name+":后卫进攻");
    }

    @Override
    public void defense() {
        System.out.println(this.name+"后卫防守");
    }
}
