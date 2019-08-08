package io.arrow.factory.pattern.abst;

/**
 * @author arrow
 * @Description TODO
 * @createTime 2019年08月08日 19:25:00
 */
public class Main {
    public static void main(String[] args) {
//        PcFactory factory = new DellFactory();
//        factory.createKeybo().sayHi();
//        factory.createMouse().sayHi();

         AbstractFactory factory = new FactoryBean();
         factory.createDellFactory().createMouse().sayHi();
         factory.createHpFactory().createKeybo().sayHi();
    }
}
