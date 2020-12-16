package com.yuxuecheng.design_patterns.strategy.example2;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author: yuxuecheng
 * @title: MVPCustomerQuoteStrategy
 * @projectName: experiment
 * @description: MVP客户的报价策略实现
 * @date 2020/12/16 11:31
 */
@Slf4j
public class MVPCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        log.info("哇偶！MVP客户享受7折优惠！！！");
        originalPrice = originalPrice.multiply(new BigDecimal(0.7)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }
}
