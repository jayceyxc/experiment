package com.yuxuecheng.design_patterns.strategy.example2;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author: yuxuecheng
 * @title: Client
 * @projectName: experiment
 * @description: 外部客户端
 * @date 2020/12/16 11:29
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        //1.创建老客户的报价策略
        IQuoteStrategy oldQuoteStrategy = new OldCustomerQuoteStrategy();

        //2.创建报价上下文对象，并设置具体的报价策略
        QuoteContext quoteContext = new QuoteContext(oldQuoteStrategy);

        //3.调用报价上下文的方法
        BigDecimal price = quoteContext.getPrice(new BigDecimal(100));

        log.info("折扣价为：" + price);

        IQuoteStrategy mvpQuoteStrategy = new MVPCustomerQuoteStrategy();
        quoteContext = new QuoteContext(mvpQuoteStrategy);
        price = quoteContext.getPrice(new BigDecimal(100));
        log.info("折扣价为：" + price);
    }
}
