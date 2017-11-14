package com.mes.create.builder;

/**
 * 電腦指揮者
 *
 * @author liukl
 * @date 2017/11/14
 */
public class ComputerDirector {
    private ComputerBuilder computerBuilder;
    public ComputerDirector(ComputerBuilder computerBuilder){
        this.computerBuilder=computerBuilder;
    }
    public void createComputer(){
        computerBuilder.getCpu();
        computerBuilder.getMotherboard();
        computerBuilder.getRam();
    }
}
