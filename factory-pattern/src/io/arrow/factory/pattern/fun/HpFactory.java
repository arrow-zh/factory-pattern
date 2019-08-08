package io.arrow.factory.pattern.fun;

import io.arrow.factory.pattern.product.HpMouse;
import io.arrow.factory.pattern.product.Mouse;

/**
 * @author arrow
 * @Description 惠普工厂类
 * @createTime 2019年08月08日 19:08:00
 */
public class HpFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
