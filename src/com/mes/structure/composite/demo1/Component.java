package com.mes.structure.composite.demo1;

public abstract class Component {
    protected String name;

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);
}
