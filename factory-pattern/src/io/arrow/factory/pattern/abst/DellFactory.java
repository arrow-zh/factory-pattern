package io.arrow.factory.pattern.abst;

import io.arrow.factory.pattern.product.DellKeybo;
import io.arrow.factory.pattern.product.DellMouse;
import io.arrow.factory.pattern.product.Keybo;
import io.arrow.factory.pattern.product.Mouse;

/**
 * @author arrow
 * @Description 戴尔工厂类
 * @createTime 2019年08月08日 19:24:00
 */
public class DellFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new DellKeybo();
    }
}
