package io.arrow.strategy.pattern;

/**
 * Create By arrow 2019/08/15
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order("1", "3214.45");
        order.pay(PayType.ALI_PAY);
    }
}
