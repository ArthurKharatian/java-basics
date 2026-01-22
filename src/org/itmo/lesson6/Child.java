package org.itmo.lesson6;

public class Child extends Parent {
    public Child(String name) {
        super(name);
    }

    public void childMethod() {

    }

    @Override
    public void print() {
//        super.print();
        System.out.println("Child overridden method");
    }
}
