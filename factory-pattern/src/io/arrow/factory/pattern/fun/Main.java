package io.arrow.factory.pattern.fun;

/**
 * @author arrow
 * @Description 主程序入口
 * @createTime 2019年08月08日 19:09:00
 */
public class Main {

    public static void main(String[] args) {
        MouseFactory factory = new DellFactory();
        factory.createMouse().sayHi();
    }
}
