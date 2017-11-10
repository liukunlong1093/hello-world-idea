package com.mes.create.factory;

/**
 * 运算工厂
 *
 * @author liukl
 * @date 2017/11/9
 */
public class OperationFactory {
    /**
     * 运算符合+
     */
    public static final String OP_ADD = "+";

    /**
     * 创建运算实例
     *
     * @param op 操作符号
     * @return 相应的运算实例
     */
    public static BaseOperation createInstance(String op) {
        BaseOperation baseOperation = null;
        if (OP_ADD.equals(op)) {
            baseOperation = new Add();
        }
        return baseOperation;
    }
}

