package ru.itmo.java.basics.lesson1;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");

        byte b = 100;
        short s = 123;
        int i = 500;
        long l = 5000000000L;
        float f = 12.3f;
        double d = 14.5;

        char c = 'a';
        boolean isTrue = true;


//        byte result = (byte)(b + i);

//        System.out.println(result);


//        long q = b + i;

//
//        double var = i / 3;
//
//        System.out.println(var);

//        String text = "Some text";
//
//        System.out.println(text);

        if (true) {
            //logic
        }


        if (false) {
            //logic
        } else {
            //logic
        }


        if (false) {
            //logic
        } else if (false) {
            //logic
        } else if (false) {
            //logic
        } else { //<- опционально

        }


        int x = 10;
        int y = 20;

        // x == y; x != y; x > y; x < y; x >= y; x <= y; x % 2 == 0;

//        if (x % 2 == 0) {
//            System.out.println("GOOD");
//        }

        if (x % 2 == 0 && x != y) {
            //logic
        }

        if (x % 2 == 0 || x != y) {
            //logic
        }


        int a = 3;

        String result = a == 5 ? "Yes" : "No";

//        String result2 = a == 5 ? a == 5 ? "No" : "Yes" : "No";  <- тяжело читается

//        System.out.println(result);

        switcher((byte) 10);

    }


    public static String getName() {
        String s = "world!";
        return s;
    }

    public static void someMethod() {
        getName();
    }


    public static String switcher(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 20:
                return "twenty";
            default:
                return "Illegal number";
        }
    }

    public static void switcher(byte num) {
        switch (num) {
            case 10:
                System.out.println("ten");
                break;
            case 20:
                System.out.println("twenty");
                break;
            default:
                System.out.println("Illegal number");
        }
    }

  // Hello from test branch
}
