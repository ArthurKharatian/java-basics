package org.itmo.lesson3;

import org.itmo.lesson2.Color;

public class StaticExample {
    public static final String STATIC_CONSTANT = "static constant";
    protected String protectedString;
    Integer number;
    private String string;
    public static String staticString;
    public String nonStaticString;
    private Color color;


    static {
        System.out.println("==========");
        System.out.println("static block start");
        staticString = "static string";
//        nonStaticString = "12321434";  нет доступа
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("==========");
    }

    {
        System.out.println("==========");
        System.out.println("non-static block start");
        nonStaticString = "non-static string";
        System.out.println(nonStaticString);
        System.out.println(staticString);
        System.out.println("non-static block end");
        System.out.println("==========");
    }

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
//        String string = "123";
        staticExample.someMethod();
//        System.out.println(staticExample);

//        Integer integer = null;
//        String string = "123";
//        Integer i = integer.parseInt(string);  // no NPE
//        System.out.println(i);
//        someMethod();  напрямую вызвать невозможно
        staticMethod();
    }

    public void someMethod() {
        System.out.println("Hello world!");
        System.out.println(nonStaticString);
    }

    public static void staticMethod() {
        System.out.println("static method print");
        System.out.println(staticString);
    }

}
