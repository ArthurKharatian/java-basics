package org.itmo.lesson13;

import org.itmo.lesson2.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(13);
        integers.add(7123);
        integers.add(1423);

//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }

        integers.removeIf(i -> i > 13);


//        integers.forEach(System.out::println);
//        System.out.println(integers);
//
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("BMW", "X3"));
//        cars.add(new Car("AUDI", "A3"));
//        cars.add(new Car("LADA", "VESTA"));
//
//        cars.sort(Comparator.comparing(Car::getModel));
//        cars.forEach(System.out::println);
    }
}
