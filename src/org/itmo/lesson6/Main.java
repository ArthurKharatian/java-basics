package org.itmo.lesson6;

import org.itmo.lesson2.Color;
import org.itmo.lesson6.modifiers.Basic;

import javax.management.ObjectName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("BMW", "X5");
//        car.setColor(Color.GREEN);
//        car.setEngineCapacity(1.2);
//        Car.class
//        Field[] declaredFields = car.getClass().getDeclaredFields();
//        for (Field declaredField : declaredFields) {
////            System.out.println(declaredField);
//        }
//        Field engineCapacity = car.getClass().getDeclaredField("engineCapacity");
//        engineCapacity.setAccessible(true);
//        engineCapacity.set(car, Double.valueOf(123.0));
////        engineCapacity.setDouble(car, 123.0);
//        engineCapacity.setAccessible(false);
//
//        System.out.println(car);

//        Method[] declaredMethods = car.getClass().getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }

//        Object object = new Object();
//
//        Car car2 = new Car("BMW", "X5");
//        car2.setColor(Color.GREEN);
//        System.out.println(car2.equals(car));

//        Parent parent = new Parent();
//        Parent child = new Child();
//        Parent anotherChild = new AnotherChild();

//        Child child3 = new Parent(); создание невозможно

//        parent.print();

//        Child child2 = new Child();
//        child2.childMethod();

//        child.print();
//
//        printInfo(parent);
//        printInfo(child);
//        printInfo(anotherChild);
//
//        Child someChild = new Child();
//        ((Parent)someChild).print();

//        ((Child)parent).print(); // <- ClassCastException

        Object o = new Child("John");
//
//        if (o instanceof Child) {
//            ((Child) o).print();
//        }
//
//        if (o instanceof Parent) {
//
//        }
//
//        if (o instanceof AnotherChild) {
//
//        }

//        Moveable bus = new Bus();
//        Moveable car = new Car("", "");
//
//        printInfo(bus);
//        printInfo(car);

        Transport bus = new Bus(5000, 50, false);
        Transport plane = new Plane(15000, 250, true);

        printInfo(bus);
        printInfo(plane);
    }


    public static void printInfo(Parent parent) {
        parent.print();
    }

    public static void printInfo(Moveable transport) {
        transport.printTransportInfo();
    }

    public static void printInfo(Transport transport) {
        transport.printTransportInfo();
    }
}
