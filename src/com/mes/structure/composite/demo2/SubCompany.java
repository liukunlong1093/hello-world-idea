package com.mes.structure.composite.demo2;

import java.util.ArrayList;
import java.util.List;
/**
 * 子公司
 *
 * @author liukl
 * @date 2017/11/8
 */
public class SubCompany extends BaseCompany {
    private List<BaseCompany> baseCompanyList = new ArrayList<>();

    public SubCompany(String name) {
        this.name=name;
    }

    @Override
    public void add(BaseCompany baseCompany) {
        baseCompanyList.add(baseCompany);
    }

    @Override
    public void remove(BaseCompany baseCompany) {
        baseCompanyList.remove(baseCompany);
    }

    @Override
    public void duties() {
        for (BaseCompany baseCompany : baseCompanyList) {
            baseCompany.duties();
        }

    }
    @Override
    public void display(int depth) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=depth;i++){
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());
        for(BaseCompany baseCompany : baseCompanyList){
            baseCompany.display(depth+2);
        }
    }

}
