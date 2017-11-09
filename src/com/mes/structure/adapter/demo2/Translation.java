package com.mes.structure.adapter.demo2;

/**
 * 翻译者
 */
public class Translation extends Player {
    private AidCenter aidCenter=new AidCenter();
    public Translation(String name) {
        super(name);
        aidCenter.setName(name);
    }

    @Override
    public void attract() {
        aidCenter.进攻();
    }

    @Override
    public void defense() {
        aidCenter.防守();
    }
}
