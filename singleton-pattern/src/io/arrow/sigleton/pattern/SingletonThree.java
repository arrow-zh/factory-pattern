package io.arrow.sigleton.pattern;

/**
 * @author arrow
 * @Description 饿汉式 线程安全，
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * @createTime 2019年08月09日 16:10:00
 */
public class SingletonThree {
    //直接作为静态变量
    private static SingletonThree singletonThree = new SingletonThree();

    /**
     * 防止New 创建
     */
    private SingletonThree() {

    }

    public static SingletonThree getInstance() {
        return singletonThree;
    }


    public void sayHi(){
        System.out.println("Hi SingletonThree");
    }
}
