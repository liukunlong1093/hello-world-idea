package com.mes.behavior.memo.demo1;

/**
 * 备忘录
 */
public class Memento {
    /** 状态*/
    private String state;

    public Memento(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }
}
