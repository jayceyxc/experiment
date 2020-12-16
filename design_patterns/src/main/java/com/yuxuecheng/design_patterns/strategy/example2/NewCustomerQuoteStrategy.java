package com.yuxuecheng.design_patterns.strategy.example2;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author: yuxuecheng
 * @title: NewCustomerQuoteStrategy
 * @projectName: experiment
 * @description: 新客户的报价策略实现类
 * @date 2020/12/16 11:27
 */
@Slf4j
public class NewCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        log.info("抱歉！新客户没有折扣！");
        return originalPrice;
    }
}
