package com.mes.structure.composite.demo1;

public class Leaf extends  Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("不能新增叶子节点");
    }

    @Override
    public void remove(Component component) {
        System.out.println("不能删除叶子节点");
    }

    @Override
    public void display(int depth) {
        System.out.println("-"+depth+name);
    }
}
