package io.arrow.proxy.pattern.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create By arrow 2019/08/15
 */
public class ClassMain {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("before");
                Object res = methodProxy.invokeSuper(o, objects);
                System.out.println(res);
                System.out.println("after");
                return res;
            }
        });
        SampleClass sampleClass = (SampleClass) enhancer.create();
        sampleClass.sayHello("Zhang San");
    }
}
