package com.mes.structure.composite.demo2;

/**
 * 财务部门
 *
 * @author liukl
 * @date 2017/11/8
 */
public class FinanceDept extends BaseCompany {
    public FinanceDept(String name) {
        this.name = name;
    }

    @Override
    public void add(BaseCompany baseCompany) {
        System.out.println("不能添加部门");
    }

    @Override
    public void remove(BaseCompany baseCompany) {
        System.out.println("不能删除部门");

    }

    @Override
    public void duties() {
        System.out.println(name + "负责记账");
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());
    }
}
