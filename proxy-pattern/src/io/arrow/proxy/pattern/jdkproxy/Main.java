package io.arrow.proxy.pattern.jdkproxy;

import io.arrow.proxy.pattern.staticed.Person;
import io.arrow.proxy.pattern.staticed.Zhangsan;

/**
 * Create By arrow 2019/08/14
 */
public class Main {

    public static void main(String[] args) {
        //设置输入生成的代理类$Proxy0
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        JdkProxy jdkProxy = new JdkProxy( new Zhangsan());
        Person person = (Person) jdkProxy.getProxyInstance();
        person.rentRoom();
    }
}
