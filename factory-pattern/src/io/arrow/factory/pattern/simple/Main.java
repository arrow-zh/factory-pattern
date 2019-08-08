package io.arrow.factory.pattern.simple;

/**
 * @author arrow
 * @Description 主程序入口
 * @createTime 2019年08月08日 18:39:00
 */
public class Main {

    public static void main(String[] args) {
        MouseFactory factory = new MouseFactory();
        factory.createMouse("DELL").sayHi();
    }
}
