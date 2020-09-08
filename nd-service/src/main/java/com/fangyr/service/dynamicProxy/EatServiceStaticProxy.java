package com.fangyr.service.dynamicProxy;

import com.fangyr.service.dynamicProxy.impl.EatServiceImpl;

/**
 * @Author:fangyurui
 * @Description:单操作代理类
 * @Date:2020-09-08
 */
public class EatServiceStaticProxy implements EatService {

    private EatService eatService;

    public EatServiceStaticProxy(EatService eatService) {
        this.eatService = eatService;
    }

    @Override
    public void eat() {
        System.out.println("您好，我是小王");
        eatService.eat();
        System.out.println("好的，下次聊");
    }

    public static void main(String[] args) {
        EatServiceStaticProxy proxy = new EatServiceStaticProxy(new EatServiceImpl());
        proxy.eat();
    }

}
