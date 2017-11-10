package com.mes.create.factorymethod;

/**
 * 基本运算类
 *
 * @author liukl
 * @date 2017/11/9
 */
public abstract class BaseOperation {
    /**
     * 数字1
     */
    protected int number1;

    /**
     * 数字2
     */
    protected int nubmer2;

    /**
     * 获取运算结果
     */
    public abstract void getResult();
}
