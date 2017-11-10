package com.mes.create.factorymethod;

/**
 * 工程方法模式测试类
 *
 * @author liukl
 * @date 2017/11/9
 */
public class Main {
    public static void main(String[] args) {
        //工程方法模式
        // 1.准守了开闭原则
        // 2.统一行为的多个实例创建调用方法如果改变行为只需要改变一处.反之简单工厂需要改变多处
        // 3.说话越抽象越灵活.
        OperationFactory operationFactory = new AddOperationFactory();
        BaseOperation baseOperation1 = operationFactory.createInstance();
        baseOperation1.number1 = 2;
        baseOperation1.nubmer2 = 1;
        baseOperation1.getResult();
        BaseOperation baseOperation2 = operationFactory.createInstance();
        baseOperation2.number1 = 2;
        baseOperation2.nubmer2 = 1;
        baseOperation2.getResult();
        BaseOperation baseOperation3 = operationFactory.createInstance();
        baseOperation3.number1 = 2;
        baseOperation3.nubmer2 = 1;
        baseOperation3.getResult();
    }
}
