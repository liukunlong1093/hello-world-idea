package com.mes.behavior.state;

/**
 * 中午工作
 *
 * @author liukl
 * @date 2017/11/9
 */
public class Noon implements State{
    @Override
    public void writeCode(Work work) {
        int hour= work.getHour();
        int beginHour=12;
        int endHour=18;

        if(hour>=beginHour && hour<=endHour){
            System.out.println("中午还没有精神");
        }
    }
}
