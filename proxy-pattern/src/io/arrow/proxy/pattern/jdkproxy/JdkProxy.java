package io.arrow.proxy.pattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 利用JDK实现代理类
 * 主要核心利用 Proxy.newProxyInstance(ClassLoader loader, Class [] interfaces, InvocationHandler handler) 方法
 * 原理：
 * Create By arrow 2019/08/14
 */
public class JdkProxy {

    private Object target;

    public JdkProxy(Object target){
        this.target = target;
    }

    /**
     * 获取代理对象类
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK动态代理租房中介开始给你找房子：");
                Object obj = method.invoke(target, args);
                System.out.println(proxy.getClass());
                System.out.println("找房子结束， 开始入住");
                return obj;
            }
        });
    }
}
