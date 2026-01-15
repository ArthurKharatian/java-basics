package org.itmo.lesson3;

import org.itmo.lesson2.Car;
import org.itmo.lesson2.CarService;
import org.itmo.lesson2.Color;

import java.util.Calendar;
import org.itmo.lesson2.CarService.*;

import static org.itmo.lesson2.CarService.totalPrice;
import static org.itmo.lesson2.Color.RED;
import static org.itmo.lesson3.StaticExample.staticMethod;

public class Main {
    public static void main(String[] args) {
//        String staticConstant = StaticExample.STATIC_CONSTANT;
//        System.out.println(staticConstant);
//        staticMethod();

        Sun sun = Sun.getSun();
//        sun.setColor(Color.RED);
//        sun.setSize(555);

        Sun sun2 = Sun.getSun();
//        sun2.setColor(Color.WHITE);
//        sun2.setSize(777);

        System.out.println(sun);
        System.out.println(sun2);

//        Color red = RED;
//        CarService carService = new CarService();
//        carService.someMethod();
//        CarService.totalPrice(new Car(), 123);

    }
}
