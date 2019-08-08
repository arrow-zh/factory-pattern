package io.arrow.factory.pattern.product;

/**
 * @author arrow
 * @Description 戴尔键盘
 * @createTime 2019年08月08日 19:21:00
 */
public class DellKeybo implements Keybo {
    @Override
    public void sayHi() {
        System.out.println("戴尔键盘");
    }
}
