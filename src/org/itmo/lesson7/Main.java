package org.itmo.lesson7;

import org.itmo.lesson6.Transport;

public class Main {
    public static void main(String[] args) {
//        OuterClass outerClass = new OuterClass();
//        outerClass.innerMethodCall();

//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();  создание невозможно
//
//        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
//        nestedStaticClass.nestedStaticClassMethod();

        SomeInterface someObject = new SomeInterface() {
            @Override
            public void print() {
                System.out.println(name());
            }

            @Override
            public String name() {
                return "John";
            }
        };

        someObject.print();

        Transport transport = new Transport(100, 120, false) {
            @Override
            protected void abstractMethod() {

            }

            @Override
            public void printTransportInfo() {

            }

            @Override
            public String transportName() {
                return null;
            }
        };
    }
}
