package com.mes.behavior.state;

/**
 * 状态上下文对象
 *
 * @author liukl
 * @date 2017/11/9
 */
public class Work {
    /** 状态对象*/
    private State state;

    /** 小时*/
    private int hour;

    Work() {
        this.state = new Morning();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 写代码
     */
    public void writeCode(){
        state.writeCode(this);
    }

}
