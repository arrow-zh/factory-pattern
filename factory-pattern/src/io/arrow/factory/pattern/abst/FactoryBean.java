package io.arrow.factory.pattern.abst;

/**
 * @author arrow
 * @Description TODO
 * @createTime 2019年08月08日 19:29:00
 */
public class FactoryBean extends AbstractFactory {
    @Override
    public PcFactory createHpFactory() {
        return new HpFactory();
    }

    @Override
    public PcFactory createDellFactory() {
        return new DellFactory();
    }
}
