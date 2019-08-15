package io.arrow.proxy.pattern.staticed;

/**
 * Create By arrow 2019/08/14
 */
public class Zhangsan implements Person {

    @Override
    public void rentRoom() {
        System.out.println("张三租房需求：");
        System.out.println("套一，小区环境好");
        System.out.println("有空调，有洗衣机，有冰箱");
    }

}
