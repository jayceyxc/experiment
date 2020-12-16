package com.yuxuecheng.design_patterns.strategy.pay;

/**
 * @author: yuxuecheng
 * @title: PayContext
 * @projectName: experiment
 * @description: 支付上下文, 含有多个算法的公有数据
 * @date 2020/12/16 11:46
 */
public class PayContext {
    //员工姓名
    private String username;
    //员工的工资
    private double money;
    //支付策略
    private PayStrategy payStrategy;

    public void pay() {
        //调用具体的支付策略来进行支付
        payStrategy.pay(this);
    }

    public PayContext(String username, double money, PayStrategy payStrategy) {
        this.username = username;
        this.money = money;
        this.payStrategy = payStrategy;
    }

    public String getUsername() {
        return username;
    }

    public double getMoney() {
        return money;
    }
}