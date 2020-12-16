package com.yuxuecheng.design_patterns.strategy.pay;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: yuxuecheng
 * @title: RMBPay
 * @projectName: experiment
 * @description: 人民币支付策略
 * @date 2020/12/16 11:47
 */
@Slf4j
public class RMBPay implements PayStrategy {
    @Override
    public void pay(PayContext ctx) {
        log.info("现在给："+ctx.getUsername()+" 人民币支付 "+ctx.getMoney()+"元！");
    }
}