package io.arrow.factory.pattern.simple;

import io.arrow.factory.pattern.product.DellMouse;
import io.arrow.factory.pattern.product.HpMouse;
import io.arrow.factory.pattern.product.Mouse;

/**
 * @author arrow
 * @Description 鼠标简单工厂
 * @createTime 2019年08月08日 18:48:00
 */
public class MouseFactory {

    /**
     * 通过类型生成对应的鼠标
     *
     * @param type
     * @return
     */
    public Mouse createMouse(String type) {
        if ("DELL".equals(type)) {
            return new DellMouse();
        } else if ("HP".equals(type)) {
            return new HpMouse();
        }
        return null;
    }
}
