package com.mes.create.factory;

/**
 * 工程模式测试类
 *
 * @author liukl
 * @date 2017/11/9
 */
public class Main {
    public static void main(String[] args) {
        BaseOperation baseOperation = OperationFactory.createInstance(OperationFactory.OP_ADD);
        baseOperation.number1 = 2;
        baseOperation.nubmer2 = 1;
        baseOperation.getResult();
        BaseOperation baseOperation1 = OperationFactory.createInstance(OperationFactory.OP_ADD);
        baseOperation1.number1 = 10;
        baseOperation1.nubmer2 = 4;
        baseOperation1.getResult();
        BaseOperation baseOperation3 = OperationFactory.createInstance(OperationFactory.OP_ADD);
        baseOperation3.number1 = 53;
        baseOperation3.nubmer2 = 43;
        baseOperation3.getResult();
    }
}
