package com.mes.create.factorymethod;

/**
 * 工程接口
 *
 * @author liukl
 * @date 2017/11/9
 */
public interface OperationFactory {
    /**
     * 创建运算实例
     *
     * @return 相应的运算实例
     */
    BaseOperation createInstance();
}
