package com.mes.structure.composite.demo1;

public class Leaf extends  Component{
    public Leaf(String name) {
        this.name=name;
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
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=depth;i++){
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());
    }
}
