package io.arrow.sigleton.pattern;

/**
 * @author arrow
 * @Description 双检锁/双重校验锁
 * 线程安全
 * @createTime 2019年08月09日 16:08:00
 */
public class SingletonFour {
    private static SingletonFour singletonFour;

    /**
     * 防止通过New方式创建
     */
    private SingletonFour() {
    }

    /**
     * 获取实例
     *
     * @return
     */
    public static SingletonFour getInstance() {
        if (singletonFour == null) {
            synchronized (SingletonFour.class) {
                singletonFour = new SingletonFour();
            }
        }
        return singletonFour;
    }

    public void sayHi() {
        System.out.println("Hi SingletonFour");
    }

}
