package io.arrow.factory.pattern.fun;

import io.arrow.factory.pattern.product.DellMouse;
import io.arrow.factory.pattern.product.Mouse;

/**
 * @author arrow
 * @Description 戴尔工厂类
 * @createTime 2019年08月08日 19:02:00
 */
public class DellFactory implements MouseFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

}
