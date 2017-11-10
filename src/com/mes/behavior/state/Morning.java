package com.mes.behavior.state;

/**
 * 早上工作
 *
 * @author liukl
 * @date 2017/11/9
 */
public class Morning implements State {
    @Override
    public void writeCode(Work work) {
        int hour= work.getHour();
        int beginHour=8;
        int endHour=12;

        if(hour>=beginHour && hour<=endHour){
            System.out.println("早上没有没有精神");
        }else{
            work.setState(new Noon());
            work.writeCode();
        }
    }
}
