package io.arrow.factory.pattern.abst;

import io.arrow.factory.pattern.product.Keybo;
import io.arrow.factory.pattern.product.Mouse;

/**
 * @author arrow
 * @Description PC工厂 既能生成鼠标 也能生成键盘
 * @createTime 2019年08月08日 19:20:00
 */
public interface PcFactory {

    /**
     * 生成鼠标
     *
     * @return
     */
    public Mouse createMouse();

    /**
     * 生成键盘
     * @return
     */
    public Keybo createKeybo();
}
