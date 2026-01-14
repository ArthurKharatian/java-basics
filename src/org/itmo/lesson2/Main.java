package org.itmo.lesson2;

import static org.itmo.lesson2.CarService.totalPrice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X5");
//        Car car2 = new Car("BMW", true);
//
//        System.out.println(car);
//        System.out.println(car2);


//        int doorsCount = car.getDoorsCount();
//        System.out.println(doorsCount);
//
//        car.setDoorsCount(5);
//        int currentDoorsCount = car.getDoorsCount();
//        System.out.println(currentDoorsCount);
//
//        String brand = car.getBrand();
//        System.out.println(brand);

        car.setColor(Color.GREEN);

        Color color = car.getColor();
//        System.out.println(color.getDescription());
//        System.out.println(color.getCode());

        car.setPrice(50000L);
        long total = totalPrice(car, null);
        long totalPrice = totalPrice(car, 10000);

        System.out.println(total);
        System.out.println(totalPrice);
    }

    public String overloadedMethod() {
        return null;
    }

    public String overloadedMethod(Integer number) {
        return null;
    }

    public String overloadedMethod(Integer number, Color color) {
        return null;
    }

    public String overloadedMethod(Color color, Integer number) {
        return null;
    }

    public Long overloadedMethod(Color color) {
        return null;
    }

    public void overloadedMethod(Long l) {

    }
}
