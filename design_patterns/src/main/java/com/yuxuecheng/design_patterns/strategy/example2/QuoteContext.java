package com.yuxuecheng.design_patterns.strategy.example2;

import java.math.BigDecimal;

/**
 * @author: yuxuecheng
 * @title: QuoteContext
 * @projectName: experiment
 * @description: 报价上下文角色
 * @date 2020/12/16 11:29
 */
public class QuoteContext {

    //持有一个具体的报价策略
    private IQuoteStrategy quoteStrategy;

    //注入报价策略
    public QuoteContext(IQuoteStrategy quoteStrategy){
        this.quoteStrategy = quoteStrategy;
    }

    //回调具体报价策略的方法
    public BigDecimal getPrice(BigDecimal originalPrice){
        return quoteStrategy.getPrice(originalPrice);
    }
}
