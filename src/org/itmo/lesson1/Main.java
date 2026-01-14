package org.itmo.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ItmoMain  -- Pascal case
//        isTrue -- camel case
//        snake_case
//        print();
//        System.out.println(isTrue());

        byte b = 100;
        short s = 123;
        int i = 550;
        long l = 50000000000L;
        float f = 12.3f;
        double d = 14.5;

        char c = 'a';
        char cNumber = 999;
        boolean isTrue = true;

//        System.out.println(c);
//        System.out.println(cNumber);

        var number = 123;
        var number2 = 123.4;
        var byteNumber = (byte) 123;


//        int result = (byte)(b + i);

//        System.out.println(result);

        double res = i * 1d / b;

//        System.out.println(res);


        if (true) {
            //logic
        }


        if (true) {
            //logic
        } else {
            //logic
        }


        if (false) {
            //logic
        } else if (true) {
            //logic
        } else if (true) {
            //logic
        } else if (true) {
            //logic
        } else if (true) {
            //logic
        }

        int x = 11;
        int y = 20;

        // x == y; x != y; x > y; x < y; x >= y; x <= y; x % 2 == 0

//        if (x % 2 == 0) {
//            System.out.println("OK");
//        }
//
//
//        if (x % 2 != 0 && x != y) {
//            System.out.println("OK");
//        }
//
//        if (x % 2 != 0 || x != y) {
//            System.out.println("OK");
//        }

        int a = 3;
//        int z;
//
//        if (a == 3) {
//           z = x;
//        } else {
//            z = y;
//        }

        int z = a == 3 ? x : y;
//        int z = a == 3 ? x == 11 ? 20 : 50 : y;  неудачный пример

//        switcher(10);
//        switcher(20);
//        switcher(100);

//        String s1 = switcher2(10);
//        String s2 = switcher2(20);
//        String s3 = switcher2(100);
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();

        System.out.println(num);
        System.out.println(str);
    }


    public static void print() {
        System.out.println("Hello world!");
    }

    public static boolean isTrue() {
        return true;
    }

    public static void switcher(int number) {
        int x;

        switch (number) {
            case 10:
                x = number;
                break;
            case 20:
                x = number + number;
                break;
            default:
                x = 1000;
        }

        System.out.println(x);
    }

    public static String switcher2(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 20:
                return "twenty";
            default:
                return "Illegal number";
        }
    }
    //Hello from github (returned)
    //Main changes!
}
