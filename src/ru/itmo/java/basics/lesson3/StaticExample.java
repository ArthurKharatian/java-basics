package ru.itmo.java.basics.lesson3;

public class StaticExample {

    public static final String STATIC_CONSTANT = "static constant";
    private String string;
    public static String staticString;
    private final String nonStatic;
    protected String protectedString;
    Integer number;

    static {
        System.out.println("==============");
        System.out.println("static block start");
        staticString = "static-string";
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("==============");
    }

    {
        System.out.println("==============");
        System.out.println("non-static block start");
        nonStatic = "non-static-string";
        System.out.println(nonStatic);
        System.out.println("non-static block end");
        System.out.println("==============");
    }

    public static void main(String[] args) {
//        StaticExample staticExample = null;
//        staticExample.someMethod();

        Integer integer = null;
        String number = "123";

        int i = integer.parseInt(number); // no NPE
        System.out.println(i);
    }


    public void someMethod() {
        System.out.println(nonStatic);
        System.out.println(staticString);
    }


    public static void printStaticVars() {
        System.out.println(staticString);
        System.out.println(new StaticExample().getNonStatic());
    }

    public String getNonStatic() {
        return nonStatic;
    }
}
