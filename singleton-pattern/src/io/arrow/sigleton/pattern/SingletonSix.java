package io.arrow.sigleton.pattern;

/**
 * @author arrow
 * @Description 枚举方式实现单例  推荐
 * @createTime 2019年08月09日 16:20:00
 */
public enum  SingletonSix {
    INSTANCE;

    public void sayHi(){
        System.out.println("Hi SingletonSix");
    }
}
