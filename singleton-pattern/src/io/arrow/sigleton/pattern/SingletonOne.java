package io.arrow.sigleton.pattern;

/**
 * @author arrow
 * @Description 单例模式  懒汉式  线程不安全
 * @createTime 2019年08月09日 16:04:00
 */
public class SingletonOne {

    private static SingletonOne singletonOne;

    /**
     * 防止通过New方式创建
     */
    private SingletonOne() {
    }

    /**
     * 获取实例
     * @return
     */
    public static SingletonOne getInstance() {
        if (singletonOne == null)
            singletonOne = new SingletonOne();

        return singletonOne;
    }

    public void sayHi(){
        System.out.println("Hi SingletonOne");
    }
}
