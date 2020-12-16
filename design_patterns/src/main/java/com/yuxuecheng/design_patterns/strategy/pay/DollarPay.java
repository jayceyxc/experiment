package com.yuxuecheng.design_patterns.strategy.pay;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: yuxuecheng
 * @title: DollarPay
 * @projectName: experiment
 * @description: 美金支付策略
 * @date 2020/12/16 11:47
 */
@Slf4j
public class DollarPay implements PayStrategy {
    @Override
    public void pay(PayContext ctx) {
        log.info("现在给："+ctx.getUsername()+" 美金支付 "+ctx.getMoney()+"dollar !");
    }
}
