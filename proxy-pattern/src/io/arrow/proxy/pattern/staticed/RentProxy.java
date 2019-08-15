package io.arrow.proxy.pattern.staticed;

/**
 * 租房代理类 用静态代理实现
 * Create By arrow 2019/08/14
 */
public class RentProxy {

    private Person person;

    public RentProxy(Person person){
        this.person = person;
    }


    public void rentRoom(){
        System.out.println("租房中介开始给你找房子：");
        this.person.rentRoom();
        System.out.println("找房子结束， 开始入住");
    }
}
