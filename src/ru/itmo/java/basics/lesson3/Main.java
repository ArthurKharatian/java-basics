package ru.itmo.java.basics.lesson3;

import ru.itmo.java.basics.lesson2.Car;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        int i = scanner.nextInt();
//        String text = scanner.next();
//
//
//        System.out.println(i);
//        System.out.println(text);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String s = reader.readLine();
//
//        System.out.println(s);
//
//        System.out.println(Integer.parseInt(s));


//        String staticConstant = StaticExample.STATIC_CONSTANT;

//        System.out.println(staticConstant);

//        printStaticVars();


        Sun sun = Sun.getSun();
        sun.setSize(555);
        sun.setColor("White");

        Sun sun2 = Sun.getSun();
        sun2.setSize(777);
        sun2.setColor("Yellow");

        sun.setColor("BLACK");

        System.out.println(sun);
        System.out.println(sun2);

    }

    public void testMethod() {
        overloadedMethod(123);
    }

    public String overloadedMethod() {
        return null;
    }


    public String overloadedMethod(Integer number) {
        return null;
    }

    public String overloadedMethod(Integer number, String name) {
        return null;
    }

    public String overloadedMethod(String name, Integer number) {
        return null;
    }

    public Long overloadedMethod(String name, Long number) {
        return null;
    }

    private void overloadedMethod(long number) {
        Car car = new Car();
    }


}
