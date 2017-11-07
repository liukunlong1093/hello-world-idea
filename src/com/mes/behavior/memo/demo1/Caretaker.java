package com.mes.behavior.memo.demo1;

/**
 * 管理者
 */
public class Caretaker {
    /** 备忘录对象*/
    private Memento memento;

    /**
     * 获取备忘录信息
     * @return 备忘录信息
     */
    public Memento getMemento() {
        return memento;
    }

    /**
     * 设置备忘录信息
     * @param memento 备忘录对象
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
