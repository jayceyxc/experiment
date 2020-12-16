package com.yuxuecheng.design_patterns.strategy.example2;

import java.math.BigDecimal;

/**
 * @author: yuxuecheng
 * @title: IQuoteStrategy
 * @projectName: experiment
 * @description: 报价策略接口
 * @date 2020/12/16 11:27
 */
public interface IQuoteStrategy {

    //获取折后价的价格
    BigDecimal getPrice(BigDecimal originalPrice);
}
