package com.mes.create.builder;

/**
 * 电脑类
 *
 * @author liukl
 * @date 2017/11/14
 */
public abstract  class ComputerBuilder {

    /**
     * 獲取CPU
     */
    public abstract  void getCpu();

    /**
     * 獲取主板
     */
    public abstract  void getMotherboard();

    /**
     * 獲取內存
     */
    public abstract  void getRam();
}
