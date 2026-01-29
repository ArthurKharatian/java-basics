package org.itmo.lesson6;

public class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

     public void print() {
        System.out.println("Method from " + this.getClass().getSimpleName() + " class");
    }
}
