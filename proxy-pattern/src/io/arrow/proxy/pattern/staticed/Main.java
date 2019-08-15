package io.arrow.proxy.pattern.staticed;

/**
 * 静态代理
 * 需要代理的方法比较固定
 * 如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度
 * 原理：
 * Create By arrow 2019/08/14
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Zhangsan();
        RentProxy rentProxy = new RentProxy(person);
        rentProxy.rentRoom();
    }
}
