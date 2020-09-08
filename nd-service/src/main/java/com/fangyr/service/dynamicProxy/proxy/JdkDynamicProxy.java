package com.fangyr.service.dynamicProxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:fangyurui
 * @Description:jdk动态代理(增强目标方法的能力)
 * @Date:2020-09-08
 */
public class JdkDynamicProxy implements InvocationHandler {

    private Object target;

    public JdkDynamicProxy(Object target) {
        this.target = target;
    }


    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你好，我是jdk动态代理");
        Object result = method.invoke(target, args);
        System.out.println("回聊");
        return result;
    }
}
