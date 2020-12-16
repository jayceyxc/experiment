package com.yuxuecheng.design_patterns.strategy.general_use;

/**
 * @author: yuxuecheng
 * @title: IStrategy
 * @projectName: experiment
 * @description: 策略接口
 * @date 2020/12/16 11:14
 */

public interface IStrategy {

    //定义的抽象算法方法 来约束具体的算法实现方法
    void algorithmMethod();
}
