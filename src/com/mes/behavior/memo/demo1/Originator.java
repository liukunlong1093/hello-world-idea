package com.mes.behavior.memo.demo1;

/**
 * 发起者
 */
public class Originator {
    /** 状态*/
    private String state;

    /**
     * 创建一个当前状态保存当前备忘录
     * @return 当前状态备忘录
     */
    public Memento createMemento() {
        return new Memento(state);
    }


    public void setState(String state) {
        this.state = state;
    }

    /**
     * 回复状态信息
     * @param memento 备忘录
     */
    public void setMemento(Memento memento) {
        this.state=memento.getState();
    }

    /**
     * 显示当前状态
     */
    public void showState(){
        System.out.println(state);
    }
}
