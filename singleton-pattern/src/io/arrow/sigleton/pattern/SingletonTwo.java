package io.arrow.sigleton.pattern;

/**
 * @author arrow
 * @Description 懒汉式  线程安全 通过synchronized关键字实现 但加锁会影响效率，每次都需要加锁
 * @createTime 2019年08月09日 16:08:00
 */
public class SingletonTwo {
    private static SingletonTwo singletonTwo;

    /**
     * 防止通过New方式创建
     */
    private SingletonTwo() {
    }

    /**
     * 获取实例
     * @return
     */
    public static synchronized SingletonTwo getInstance() {
        if (singletonTwo == null)
            singletonTwo = new SingletonTwo();

        return singletonTwo;
    }

    public void sayHi(){
        System.out.println("Hi SingletonTwo");
    }

}
