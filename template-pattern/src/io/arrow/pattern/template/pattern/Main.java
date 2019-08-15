package io.arrow.pattern.template.pattern;

/**
 * Create By arrow 2019/08/15
 * 模板方法模式：子类可以置换掉父类的可变部分，但是子类却不可以改变模板方法所代表的顶级逻辑。
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
