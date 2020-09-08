package com.fangyr.service.dynamicProxy.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author:fangyurui
 * @Description:jdk动态代理工厂代理类
 * @Date:2020-09-08
 */
public class JdkDynamicProxyFactory {

    private JdkDynamicProxy jdkDynamicProxy;

    public JdkDynamicProxyFactory(JdkDynamicProxy jdkDynamicProxy) {
        this.jdkDynamicProxy = jdkDynamicProxy;
    }

    public Object getProxy() {
        Object target = jdkDynamicProxy.getTarget();
        return Proxy.newProxyInstance(jdkDynamicProxy.getClass().getClassLoader(), target.getClass().getInterfaces(), jdkDynamicProxy);
    }

}
