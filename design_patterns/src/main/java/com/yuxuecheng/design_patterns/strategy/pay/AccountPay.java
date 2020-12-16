package com.yuxuecheng.design_patterns.strategy.pay;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: yuxuecheng
 * @title: AccountPay
 * @projectName: experiment
 * @description: 银行账户支付
 * @date 2020/12/16 13:28
 */
@Slf4j
public class AccountPay implements PayStrategy {
    @Override
    public void pay(PayContext ctx) {
        PayContextWithAccount ctxAccount = (PayContextWithAccount) ctx;
        log.info("现在给：" + ctxAccount.getUsername() + "的账户：" + ctxAccount.getAccount() + " 支付工资：" + ctxAccount.getMoney() + " 元！");
    }
}