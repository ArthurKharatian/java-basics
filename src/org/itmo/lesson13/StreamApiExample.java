package org.itmo.lesson13;

import org.itmo.lesson2.Car;
import org.itmo.lesson2.Color;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<PromoCode> promos = new ArrayList<>();
        promos.add(new PromoCode("SKIDKA100", true, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA100", false, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA200", false, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA100", false, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA500", true, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA400", true, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA100", true, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA100", false, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA200", true, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA500", true, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA100", true, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA100", false, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA200", false, BigDecimal.ONE));
        promos.add(new PromoCode("SKIDKA200", true, BigDecimal.ONE));

//
//        List<PromoCode> notExpiredPromos = promos.stream().filter(code -> !code.getExpired())
//                .collect(Collectors.toList());
//
////        notExpiredPromos.forEach(System.out::println);
//
//
//        List<PromoCode> expiredPromos = promos.stream().filter(PromoCode::getExpired)
//                .collect(Collectors.toList());
//
////        expiredPromos.forEach(System.out::println);
//
//
//        Map<String, List<PromoCode>> map = promos.stream().collect(Collectors.groupingBy(PromoCode::getCode));

//        map.forEach((key, value) -> {
//            System.out.println("==================================");
//            System.out.println(key);
//            System.out.println("==================================");
//            value.forEach(System.out::println);
//            System.out.println("==================================");
//        });

//        List<PromoCode> skidka100 = map.get("SKIDKA100");

//
//        List<String> strings = promos.stream().map(PromoCode::getCode).collect(Collectors.toList());
////        List<String> strings2 = promos.stream().map(PromoCode::getCode).toList();  <- Java 17
////        strings.forEach(System.out::println);
////        strings2.forEach(System.out::println);


//        Collection<List<PromoCode>> values = map.values();

//        List<PromoCode> collect = map.values().stream().flatMap(Collection::stream).collect(Collectors.toList());

//        BigDecimal result = promos.stream().map(PromoCode::getAmount).reduce(BigDecimal.ZERO, BigDecimal::add);

//        System.out.println(result);


//        Map<String, PromoCode> collect = promos.stream().collect(Collectors.toMap(PromoCode::getCode, Function.identity(), (a, b) -> a));

//        System.out.println(collect);

//
//        AtomicInteger count = new AtomicInteger();
////        for (PromoCode code : promos) {
////            if (code.getCode().equals("SKIDKA100")) {
////                count++;
////            }
////        }
//
//        promos.forEach(code -> {
//            if (code.getCode().equals("SKIDKA100")) {
//                count.getAndIncrement();
//            }
//        });
//
//        int result = count.get();
//        System.out.println(result);

//
//        List<Car> cars = promos.stream().map(code -> new Car(code.getCode(), String.valueOf(code.getAmount())))
//                .collect(Collectors.toList());
//
//        cars.forEach(System.out::println);
    }
}
