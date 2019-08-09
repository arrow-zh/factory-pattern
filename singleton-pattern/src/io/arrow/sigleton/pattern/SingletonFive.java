package io.arrow.sigleton.pattern;

/**
 * @author arrow
 * @Description 静态内部类
 * 线程安全
 * @createTime 2019年08月09日 16:08:00
 */
public class SingletonFive {

    private static class SingletonFiveHoder {
        private static final SingletonFive INSTANCE = new SingletonFive();
    }

    /**
     * 防止通过New方式创建
     */
    private SingletonFive() {
    }

    /**
     * 获取实例
     * @return
     */
    public static SingletonFive getInstance() {
        return SingletonFiveHoder.INSTANCE;
    }

    public void sayHi() {
        System.out.println("Hi SingletonFour");
    }

}
