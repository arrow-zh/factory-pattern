package io.arrow.sigleton.pattern;

/**
 * @author arrow
 * @Description 主程序入口 用于测试
 * @createTime 2019年08月09日 16:07:00
 */
public class Main {

    public static void main(String[] args) {
        SingletonOne singletonOne = SingletonOne.getInstance();
        singletonOne.sayHi();

        SingletonTwo singletonTwo = SingletonTwo.getInstance();
        singletonTwo.sayHi();

        SingletonThree singletonThree = SingletonThree.getInstance();
        singletonThree.sayHi();

        SingletonFour singletonFour = SingletonFour.getInstance();
        singletonFour.sayHi();

        SingletonFive singletonFive = SingletonFive.getInstance();
        SingletonFive singletonFive2 = SingletonFive.getInstance();
        System.out.println("singletonFive:" + (singletonFive == singletonFive2));

        SingletonSix singletonSix = SingletonSix.INSTANCE;
        SingletonSix singletonSix2 = SingletonSix.INSTANCE;
        System.out.println("singletonSix:" + (singletonSix == singletonSix2));
    }
}
