package com.mes.structure.composite.demo1;

public class Main {
    public static  void main(String [] args){
        Composite root=new Composite("根");
        Leaf leaf1=new Leaf("叶子节点1");
        Leaf leaf2=new Leaf("叶子节点2");
        root.add(leaf1);
        root.add(leaf2);

        Composite composite1=new Composite("枝干1");
        Leaf leaf11=new Leaf("枝干1叶子节点1");
        Leaf leaf22=new Leaf("枝干2叶子节点2");
        composite1.add(leaf11);
        composite1.add(leaf22);
        root.add(composite1);
        root.remove(leaf1);
        root.display(1);
    }
}
