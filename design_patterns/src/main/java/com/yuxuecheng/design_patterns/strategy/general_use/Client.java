package com.yuxuecheng.design_patterns.strategy.general_use;

/**
 * @author: yuxuecheng
 * @title: Client
 * @projectName: experiment
 * @description: 使用客户端
 * @date 2020/12/16 11:26
 */
public class Client {
    public static void main(String[] args) {
        //1.创建具体测策略实现
        IStrategy strategy = new ConcreteStrategy2();
        //2.在创建策略上下文的同时，将具体的策略实现对象注入到策略上下文当中
        StrategyContext ctx = new StrategyContext(strategy);
        //3.调用上下文对象的方法来完成对具体策略实现的回调
        ctx.contextMethod();
    }
}
