package com.yuxuecheng.design_patterns.strategy.example2;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author: yuxuecheng
 * @title: VIPCustomerQuoteStrategy
 * @projectName: experiment
 * @description: VIP客户的报价策略实现
 * @date 2020/12/16 11:28
 */
@Slf4j
public class VIPCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        log.info("恭喜！VIP客户享有8折优惠！");
        originalPrice = originalPrice.multiply(new BigDecimal(0.8)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }
}
