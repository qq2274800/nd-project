package com.fangyr.service.dynamicProxy.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author:fangyurui
 * @Description:cglib动态代理
 * @Date:2020-09-08
 */
public class CglibDynamicProxy implements MethodInterceptor {

    private Object target;

    public CglibDynamicProxy(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("你好，我是cglib动态代理");
        Object result = method.invoke(target, objects);
        System.out.println("回聊，再见！");
        return result;
    }
}
