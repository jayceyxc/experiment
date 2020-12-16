package com.yuxuecheng.design_patterns.strategy.general_use;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: yuxuecheng
 * @title: ConcreteStrategy
 * @projectName: experiment
 * @description: TODO
 * @date 2020/12/16 11:15
 */
@Slf4j
public class ConcreteStrategy implements IStrategy {

    @Override
    public void algorithmMethod() {
        log.info("this is ConcreteStrategy method...");
    }
}
