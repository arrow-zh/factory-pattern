package io.arrow.strategy.pattern;

/**
 * Create By arrow 2019/08/15
 */
public enum PayType {

    ALI_PAY(new AliPay()), WEIXIN_PAY(new WeixinPay());

    private Payment payment;

    public Payment getPayment() {
        return this.payment;
    }

    PayType(Payment payment) {
        this.payment = payment;
    }

}
