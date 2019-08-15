package io.arrow.strategy.pattern;

/**
 * Create By arrow 2019/08/15
 */
public class WeixinPay implements Payment {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
