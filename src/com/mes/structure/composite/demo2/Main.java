package com.mes.structure.composite.demo2;

/**
 * 测试类
 *
 * @author liukl
 * @date 2017/11/8
 */
public class Main {
    public static  void main(String [] args){
        SubCompany root=new SubCompany("总部");
        FinanceDept financeDept=new FinanceDept("总部财务");
        root.add(financeDept);

        SubCompany subCompany=new SubCompany("上海分公司");
        FinanceDept financeDept1=new FinanceDept("分公司财务");
        subCompany.add(financeDept1);
        root.add(subCompany);
        root.display(1);
        root.duties();
    }
}
