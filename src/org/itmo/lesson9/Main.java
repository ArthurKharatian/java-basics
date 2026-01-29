package org.itmo.lesson9;

import org.itmo.lesson2.Car;
import org.itmo.lesson6.AnotherChild;
import org.itmo.lesson6.Child;
import org.itmo.lesson6.Parent;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(123);
        list.add("String");
        list.add(true);
        list.add(new Car("", ""));

//        System.out.println(list);

        List<String> strings = new ArrayList<String>();
//        var strings2 = new ArrayList<>();
        strings.add("true");
        strings.add("123");
        strings.add("String");

//        System.out.println(strings);

        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string).append(" ");
        }

//        System.out.println(builder);

//        System.out.println(strings);
//        Collections.sort(strings);
//        System.out.println(strings);

        List<Integer> integers = new ArrayList<>();
        integers.add(12412);
        integers.add(12412);
        integers.add(12412);
        integers.add(12412);
        integers.add(12412);
        integers.add(12412);
        integers.add(12412);
        integers.add(12412);
        integers.add(12412);
        integers.add(5655);
        integers.add(4);
        integers.add(3342);
        integers.add(3342);
        integers.add(3342);
        integers.add(3342);
        integers.add(3342);
        integers.add(3342);
        integers.add(3342);
        integers.add(3342);
        integers.add(3342);
        integers.add(334);
        integers.add(334);
        integers.add(334);
        integers.add(334);
        integers.add(334);
        integers.add(334);
        integers.add(334);

//        integers.remove(Integer.valueOf(334));

//        System.out.println(integers);

//        for (Integer integer : integers) { // <- ConcurrentModificationException
//            if (integer == 5655) {
//                integers.remove(integer);
//            }
//        }

//        for (int i = 0; i < integers.size(); i++) {
//            if (integers.get(i) == 5655) {
//                integers.remove(integers.get(i));
//            }
//        }

//        System.out.println(integers);


        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 5655) {
                iterator.remove();
            }
        }

//        System.out.println(integers);

        List<Integer> ints = Arrays.asList(123, 33, 123, 4343);  // Java 8
//        ints.add(23);  // UnsupportedOperationException

        List<Integer> ints2 = List.of(123, 33, 123, 4343);  // Java 11
//        ints2.add(33); // UnsupportedOperationException

        List<Integer> unmodifiableList = Collections.unmodifiableList(integers);
//        unmodifiableList.add(88);  // UnsupportedOperationException


//        Integer integer = ints.get(0);
//        Integer integer2 = ints.get(1);
//        Integer integer3 = ints.get(2);
//
//        Parent parent = new Parent("Mike");
//
//        printInfo(parent);
//        printInfo(new Child("Jack"));
////        printInfo(new AnotherChild("Bob"));
//
//        List<Parent> parents = List.of(parent);
//        List<Child> children = List.of(new Child(""));
//        List<AnotherChild> anotherChildren = List.of(new AnotherChild(""));

//        printInfo(parents);
//        printInfo(children);
//        printInfo(anotherChildren);
//
//        printInfo2(children);
//        printInfo2(parents);
//        printInfo2(anotherChildren); неподдерживаемый тип


        Set<String> set = new TreeSet<>();
        set.add("String");
        for (int i = 0; i < 100; i++) {
            set.add("Java");
        }
        set.add("true");
        set.add("123");

//        System.out.println(set);

//        List<String> strings1 = new ArrayList<>(set);

//        String next = set.iterator().next();

        Set<Integer> uniques = new HashSet<>(integers);
//        System.out.println(uniques);

//        Set.of();
//        Collections.unmodifiableSet();

        //   key     value
        Map<String, Integer> map = new HashMap<>();

        map.put("John", 12354);
        map.put("Alice", 12253);
        map.put("Katie", 2354);
        map.put("Bob", 782354);
        map.put("Mike", 782354);
//        map.put("Mike", 7777);  перезапись значения

        boolean isContainsKey = map.containsKey("Mike");
//        System.out.println(isContainsKey);

//        System.out.println(map);
        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();

//        Integer num = map.get("Bob");
//        System.out.println(num);
//        Integer num2 = map.get("Alex");
        Integer num2 = map.getOrDefault("Alex", 0);
//        System.out.println(num2);


//        List<String> keysByValue = getKeysByValue(map, 782354);
//        System.out.println(keysByValue);
    }

    public static void printInfo(Parent parent) {
        parent.print();
    }

    public static void printInfo(List<? extends Parent> parents) {
        for (Parent parent : parents) {
            printInfo(parent);
        }
    }

    public static void printInfo2(List<? super Child> parents) {
        for (Object parent : parents) {

        }
    }

    public <T> void process(List<T> list) {
        for (T objects : list) {
            // TO DO
        }
    }

    public static List<String> getKeysByValue(Map<String, Integer> map, Integer value) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String pairKey = pair.getKey();
            Integer pairValue = pair.getValue();

            if (pairValue != null && pairValue.equals(value)) {
                result.add(pairKey);
            }
        }

        return result;
    }

}
