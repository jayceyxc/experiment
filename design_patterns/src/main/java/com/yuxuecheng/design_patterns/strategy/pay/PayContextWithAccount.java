package com.yuxuecheng.design_patterns.strategy.pay;

/**
 * @author: yuxuecheng
 * @title: PayContextWithAccount
 * @projectName: experiment
 * @description: 带银行账户的支付上下文
 * @date 2020/12/16 13:29
 */
public class PayContextWithAccount extends PayContext {
    //银行账户
    private String account;

    public PayContextWithAccount(String username, double money, PayStrategy payStrategy, String account) {
        super(username, money, payStrategy);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }
}
