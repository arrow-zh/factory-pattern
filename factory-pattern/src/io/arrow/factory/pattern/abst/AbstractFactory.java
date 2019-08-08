package io.arrow.factory.pattern.abst;

/**
 * @author arrow
 * @Description 定义抽象工厂
 * @createTime 2019年08月08日 19:27:00
 */
public abstract class AbstractFactory {

    /**
     * 创建Hp工厂
     * @return
     */
    public abstract PcFactory createHpFactory();


    /**
     * 创建Dell工厂
     * @return
     */
    public abstract PcFactory createDellFactory();
}
