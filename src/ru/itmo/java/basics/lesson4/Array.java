package ru.itmo.java.basics.lesson4;

import ru.itmo.java.basics.lesson2.Car;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] ints = new int[10];

        ints[0] = 20;
        ints[1] = 321;
        ints[2] = 202;
        ints[3] = 2302;
        ints[4] = 21;
        ints[5] = 220;


//        System.out.println(Arrays.toString(ints));

        String[] strings = new String[5];

//        System.out.println(Arrays.toString(strings));


        long[] longs = new long[]{123L, 321L, 333L};

//        System.out.println(Arrays.toString(longs));

        long[] longs2 = {123L, 322L, 333L};

        Car[] cars = new Car[3];

        cars[0] = new Car("BMW", "X3");
        cars[1] = new Car("Mercedes", "e200");
        cars[2] = new Car("KIA", "K5");

//        System.out.println(Arrays.toString(cars));


//        for (int i = 0; i < longs2.length; i++) {
//            if (longs2[i] % 2 == 0) {
//                System.out.println(longs2[i]);
//            }
//        }

//        for (Car car : cars) {
//            if (car.getBrand().equals("BMW")) {
//                System.out.println(car);
//            }
//        }

        int x = 0;

//        do {
//            System.out.println(++x);
//        } while (x != 10);


//        while (x != 5) {
//            x++;
//
//            if (x < 2) {
//                System.out.println(x);
//                continue;
//            }
//
//            System.out.println("next");
//
//            if (x == 3) {
//                break;
//            }
//
//        }

//        varargMethod(123, "Hello!");
//        varargMethod(123, "Hello!", "world", "!");
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        int i = Arrays.binarySearch(ints, 21);
        int y = Arrays.binarySearch(ints, 215);

        System.out.println(i);
        System.out.println(y);


    }


    public static void varargMethod(Integer num, String... line) {
        for (String s : line) {
            // logic
        }
    }


//    public static void  varargMethod(String... line, Integer num) {
//
//    }

//    public static void varargMethod(String... line, String... line2) {
//
//    }

}
