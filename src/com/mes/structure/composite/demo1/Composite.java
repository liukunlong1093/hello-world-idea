package com.mes.structure.composite.demo1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends  Component{
    private List<Component> children= new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);

    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        for(Component component:children){
            component.display(depth+2);
        }
    }
}
