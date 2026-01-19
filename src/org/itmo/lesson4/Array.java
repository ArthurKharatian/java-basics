package org.itmo.lesson4;


import org.itmo.lesson2.Car;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] ints = new int[10];

        ints[0] = 20;
        ints[1] = 232;
        ints[2] = 40;
        ints[3] = 2;
        ints[4] = 2220;
        ints[5] = 201;

//        System.out.println(Arrays.toString(ints));

        String[] strings = new String[3];
        strings[2] = "word";

//        System.out.println(Arrays.toString(strings));

        long[] longs = new long[]{112L, 33L, 4576L, 3L};
//        System.out.println(Arrays.toString(longs));

        long[] longs2 = {112L, 33L, 4576L, 3L};


        Car[] cars = new Car[3];
        cars[0] = new Car("Lada", "Vesta");
        cars[1] = new Car("BMW", "Vesta");
        cars[2] = new Car("KIA", "Vesta");

//        System.out.println(Arrays.toString(cars));

//        for (int i = 0; i < cars.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(cars[i]);
//            }
//        }


//        int x = 0;
//        x++;
//        x = x + 1;
//
//        for (Car car : cars) {
////            System.out.println(car);
////            if (car.getBrand().equals("Lada")) {
////                System.out.println(car);
////            }
//
//            car.setIsNew(true);
//        }
//        System.out.println(Arrays.toString(cars));

        int x = 0;

//        do {
//            // logic
//            System.out.println(++x);
//        } while (x != 10);

//        while (x != 5) {
//            x++;
//
//            if (x < 3) {
//                continue;
//            }
//
//
//            System.out.println(x);
//
//            if (x == 4) {
//                break;
//            }
//        }

        varargMethod(1, 2, 3, 4);
        varargMethod(1, 2, 3);
        varargMethod(1, 2, 3, 4, 6,5, 123, 323, 323);
        varargMethod(100);

//        Arrays.sort(ints);
//        System.out.println(Arrays.toString(ints));
//
//        int index = Arrays.binarySearch(ints, 40);
//        System.out.println(index);
//
//        int index2 = Arrays.binarySearch(ints, 60);
//        System.out.println(index2);

    }


    public static void someMethod(int[] array) {
        //logic
    }

    public static void varargMethod(int... numbers) {
        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[2]);

    }

    public static void varargMethod(String str,  int... numbers) {

    }

//    public static void varargMethod(int... numbers, String str) { невозможно объявить метод
//
//    }
}
