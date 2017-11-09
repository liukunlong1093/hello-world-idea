package com.mes.structure.composite.demo2;

/**
 * 公司基类
 *
 * @author liukl
 * @date 2017/11/8
 */
public abstract class BaseCompany {

    /** 姓名*/
    protected String name;

    /**
     * 新增
     *
     * @param baseCompany 公司对象
     */
    public abstract void add(BaseCompany baseCompany);

    /**
     * 删除
     *
     * @param baseCompany 公司对象
     */
    public abstract void remove(BaseCompany baseCompany);

    /**
     * 职责
     */
    public abstract void duties();

    /**
     * 展示
     *
     * @param depth 级别
     */
    public abstract void display(int depth);
}
