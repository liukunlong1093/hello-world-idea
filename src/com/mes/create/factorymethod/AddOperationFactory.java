package com.mes.create.factorymethod;

/**
 * 一句话描述这个类的作用
 *
 * @author liukl
 * @date 2017/11/9
 */
public class AddOperationFactory implements OperationFactory{
    @Override
    public BaseOperation createInstance() {
        return new Add();
    }
}
