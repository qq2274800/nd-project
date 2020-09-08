package com.fangyr.service.dynamicProxy.impl;

import com.fangyr.service.dynamicProxy.EatService;

/**
 * @Author:fangyurui
 * @Description:2
 * @Date:2020-09-08
 */
public class EatServiceImpl implements EatService {

    @Override
    public void eat() {
        System.out.println("吃了吗？");
    }
}
