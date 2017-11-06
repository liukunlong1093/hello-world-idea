package com.mes.structure.adapter.demo2;

/**
 * 球员类
 */
public abstract  class Player {
    /**
     * 球员名称
     */
    protected String name;

    public Player(String name){
        this.name=name;
    }

    /**
     * 进攻
     */
    public abstract void attract();

    /**
     * 防守
     */
    public abstract  void defense();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
