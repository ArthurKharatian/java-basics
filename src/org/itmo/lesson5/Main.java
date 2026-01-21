package org.itmo.lesson5;

import org.itmo.lesson2.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        String java = "Java";

//        String java2 = new String("JaVa");

//        boolean b1 = java == java2;
//        boolean b2 = java.equals(java2);
//        boolean b3 = java.equalsIgnoreCase(java2);
//
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);

//        String concat = java.concat(" Developer");
//        java = java.concat(" Developer");
//        System.out.println(java);


//        java = java + 123;

//        Car car = new Car("KIA", "Rio");

//        java = 80 + 120 + java + (140 + 260) + car;
//        java = 80 + 120 + java + (140 + 260);

//        System.out.println(java);

//        int length = java.length();
//        System.out.println(length);

//        char[] chars = java.toCharArray();
//        for (char aChar : chars) {
//            if (!Character.isDigit(aChar)) {
//                System.out.println(aChar);
//            }
//        }

//        System.out.println(Arrays.toString(chars));

//        String str = " hello ".trim();
//        //        System.out.println(str.length());
//
//        if (str != null && !str.isEmpty()) {
//            System.out.println(123);
//            System.out.println(str);
//        }
//
//        String substring = java.substring(3);
//        String substring2 = java.substring(3, 8);
//        System.out.println(java);
//        System.out.println(substring);
//        System.out.println(substring2);

        String string = "1241Hello world12312415!";

        String s = string.replaceAll("[^0-9]", "*");
//
//        System.out.println(s);
//
//        String s2 = string.replace("1", "?");
//
//        System.out.println(s2);

        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
                "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like " +
                "Aldus PageMaker including versions of Lorem Ipsum.";

//        System.out.println(text);
//
//        String[] words = text.split(" ");
//        for (String word : words) {
//            System.out.println(word);
//        }

//        Car car = null;
////        System.out.println(car);
//        String s = String.valueOf(car);
//
//        System.out.println(s);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//
//        System.out.println(s);

        String java = "Java";
//        StringBuilder builder = new StringBuilder(java);
//        StringBuilder builder2 = new StringBuilder(java);
//        builder.append(777);
//        System.out.println(builder);
//
//        System.out.println(java == builder2.toString());
//        System.out.println(builder == builder2);
//        System.out.println(builder.equals(builder2));
////        System.out.println(builder.toString().equals(builder2.toString()));
//        System.out.println(java.equals(builder2.toString()));
//        System.out.println(java.equals(builder));

        StringBuilder builder = new StringBuilder();

//        for (String word : text.split(" ")) {
//            builder.append(word)
//                    .append("\"");
//        }
//
//        System.out.println(builder);

        StringBuffer buffer = new StringBuffer();

//        System.out.println("Артём".equals("Артем"));
    }
}
