package com.mes.behavior.memo.demo1;

/**
 * 客户端
 */
public class Main {
    public static void main(String[] args){
        Originator originator=new Originator();
        originator.setState("OFF");
        originator.showState();
        Memento memento=originator.createMemento();
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(memento);
        originator.setState("NO");
        originator.showState();
        originator.setMemento(caretaker.getMemento());
        originator.showState();
    }
}
