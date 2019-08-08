package io.arrow.factory.pattern.fun;

import io.arrow.factory.pattern.product.Mouse;

/**
 * @author arrow
 * @Description 鼠标工厂接口
 * @createTime 2019年08月08日 18:59:00
 */
public interface MouseFactory {

    /**
     * 用于生成鼠标的接口
     */
    public Mouse createMouse();
}
