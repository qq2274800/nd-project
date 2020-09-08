package com.fangyr.service.dynamicProxy;

import com.fangyr.service.dynamicProxy.impl.EatServiceImpl;
import com.fangyr.service.dynamicProxy.proxy.CglibDynamicProxy;
import com.fangyr.service.dynamicProxy.proxy.CglibDynamicProxyFactory;
import com.fangyr.service.dynamicProxy.proxy.JdkDynamicProxy;
import com.fangyr.service.dynamicProxy.proxy.JdkDynamicProxyFactory;

/**
 * @Author:fangyurui
 * @Description:动态代理test
 * @Date:2020-09-08
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        /**
         * jdk
         */
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy(new EatServiceImpl());
        JdkDynamicProxyFactory jdkFactory = new JdkDynamicProxyFactory(jdkDynamicProxy);
        EatService eatJdkProxy = (EatService) jdkFactory.getProxy();
        eatJdkProxy.eat();

        System.out.println("---我是分割线---");

        /**
         * cglib
         */
        CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy(new EatServiceImpl());
        CglibDynamicProxyFactory cglibFactory = new CglibDynamicProxyFactory(cglibDynamicProxy);
        EatService eatCglibProxy = (EatService) cglibFactory.getProxy();
        eatCglibProxy.eat();

    }

}
