package io.arrow.factory.pattern.abst;

import io.arrow.factory.pattern.product.HpKeybo;
import io.arrow.factory.pattern.product.HpMouse;
import io.arrow.factory.pattern.product.Keybo;
import io.arrow.factory.pattern.product.Mouse;

/**
 * @author arrow
 * @Description 惠普工厂
 * @createTime 2019年08月08日 19:23:00
 */
public class HpFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new HpKeybo();
    }
}
