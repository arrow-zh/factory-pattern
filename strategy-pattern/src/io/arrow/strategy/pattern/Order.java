package io.arrow.strategy.pattern;

/**
 * Create By arrow 2019/08/15
 */
public class Order {

    private String uid;
    private String amount;

    public Order(String uid, String amount) {
        this.uid = uid;
        this.amount = amount;
    }

    public void pay(PayType payType) {
        System.out.println("下单成功 待支付:" + this.amount);
        payType.getPayment().pay();
    }
}