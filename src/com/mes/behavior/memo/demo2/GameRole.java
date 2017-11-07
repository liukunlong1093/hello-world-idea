package com.mes.behavior.memo.demo2;

/**
 * 游戏角色
 */
public class GameRole {
    /** 生命力*/
    private int vitality;

    /** 攻击力*/
    private int attack;

    /** 防御力*/
    private int defense;

    public GameRoleMemento bakGameRole(){
        return new GameRoleMemento(vitality,attack,defense);
    }

    public void revertGameRole(GameRoleMemento gameRoleMemento){
        this.vitality=gameRoleMemento.getVitality();
        this.attack=gameRoleMemento.getAttack();
        this.defense=gameRoleMemento.getDefense();
    }
    public void initRole(){
        this.vitality=100;
        this.attack=100;
        this.defense=100;
    }

    public void gameOver(){
        this.vitality=0;
        this.attack=0;
        this.defense=0;
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "vitality=" + vitality +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }

    public void show(){
        System.out.println(this.toString());
    }
}
