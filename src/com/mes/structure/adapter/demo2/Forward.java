package com.mes.structure.adapter.demo2;

/**
 * 前锋
 */
public class Forward extends Player{
    public Forward(String name) {
        super(name);
    }

    @Override
    public void attract() {
        System.out.println(this.name+":进攻");
    }

    @Override
    public void defense() {
        System.out.println(this.name+"防守");
    }
}
