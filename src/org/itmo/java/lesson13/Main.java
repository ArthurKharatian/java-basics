package org.itmo.java.lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1213, 34, 342,123, 43,123 ,3124, 43);

        System.out.println("=========================");

//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }

//        integers.forEach(integer -> {
//            if (integer < 200) {
//                System.out.println(integer);
//            }
//        });
//
//        integers.stream().parallel().forEach(integer -> {
//            if (integer < 200) {
//                System.out.println(integer);
//            }
//        });


//        integers.forEach(System.out::println);

        List<Integer> ints = new ArrayList<>(integers);

        ints.removeIf(integer -> integer > 500);

        System.out.println(ints);
    }
}
