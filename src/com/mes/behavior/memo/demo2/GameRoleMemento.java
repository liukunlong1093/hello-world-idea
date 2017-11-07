package com.mes.behavior.memo.demo2;

/**
 * 角色备忘录
 */
public class GameRoleMemento {
    /** 生命力*/
    private int vitality;

    /** 攻击力*/
    private int attack;

    /** 防御力*/
    private int defense;

    public GameRoleMemento(int vitality,int attack,int defense){
        this.vitality=vitality;
        this.attack=attack;
        this.defense=defense;
    }

    public int getVitality() {
        return vitality;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}
