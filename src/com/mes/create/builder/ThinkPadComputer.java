package com.mes.create.builder;

/**
 * ThinkPad電腦
 *
 * @author liukl
 * @date 2017/11/14
 */
public class ThinkPadComputer extends  ComputerBuilder{
    @Override
    public void getCpu() {
        System.out.println("ThinkPad CPU");
    }

    @Override
    public void getMotherboard() {
        System.out.println("ThinkPad 主板");
    }

    @Override
    public void getRam() {
        System.out.println("ThinkPad 內存");
    }
}
