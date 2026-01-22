package org.itmo.lesson6;

public interface Moveable {
    public static final String NAME = "Bard";

    public abstract void printTransportInfo();

    public abstract String transportName();

    public default void someMethod() {
        //logic
    }

    public static void staticMethod() {
        //logic
    }

    private static void privateStaticMethod() { // в Java 8 нет
        //logic
    }
}
