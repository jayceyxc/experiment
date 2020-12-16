package com.yuxuecheng.design_patterns.strategy.pay;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: yuxuecheng
 * @title: AccountPay2
 * @projectName: experiment
 * @description: 支付到银行账户的策略
 * @date 2020/12/16 13:31
 */
@Slf4j
public class AccountPay2 implements PayStrategy {
    //银行账户
    private String account;

    public AccountPay2(String account) {
        this.account = account;
    }

    @Override
    public void pay(PayContext ctx) {
        log.info("现在给：" + ctx.getUsername() + "的账户：" + getAccount() + " 支付工资：" + ctx.getMoney() + " 元！");
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}