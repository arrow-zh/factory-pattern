package io.arrow.pattern.template.pattern;

/**
 * Create By arrow 2019/08/15
 */
public abstract class AbstractClass {

    public abstract void oper1();

    public abstract void oper2();

    public abstract void oper3();

    public final void templateMethod() {
        this.oper1();
        this.oper2();
        this.oper3();
    }
}
