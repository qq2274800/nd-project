package com.fangyr.service.dynamicProxy.proxy;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Author:fangyurui
 * @Description:cglib动态代理工厂类
 * @Date:2020-09-08
 */
public class CglibDynamicProxyFactory {

    private CglibDynamicProxy cglibDynamicProxy;

    public CglibDynamicProxyFactory(CglibDynamicProxy cglibDynamicProxy) {
        this.cglibDynamicProxy = cglibDynamicProxy;
    }

    public Object getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setInterfaces(cglibDynamicProxy.getTarget().getClass().getInterfaces());
        enhancer.setCallback(cglibDynamicProxy);
        return enhancer.create();
    }

}
