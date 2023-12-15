package ru.itmo.java.basics.lesson5;

public class Main {
    public static void main(String[] args) {
        String java = "Java";
//        String java2 = new String("JaVa");


//        System.out.println(java == java2);
//        System.out.println(java.equals(java2));
//        System.out.println(java.equalsIgnoreCase(java2));


        java = java.concat(" Developer");

//        System.out.println(java);

//        int length = java.length();
//        System.out.println(length);

//        String str = null;
//        String emptyString = "";
//
//        System.out.println(emptyString.isEmpty());
//
//        if (str != null && !str.isEmpty()) {
//            //logic
//        }

//        System.out.println(java.contains("Net"));


//        java = java + 123;
//
//        System.out.println(java);


//        java = 80 + 120 + java + (140 + 160);
//
//        System.out.println(java);


//        char[] chars = java.toCharArray();
//
//        for (char aChar : chars) {
//            if (Character.isDigit(aChar)) {
//                System.out.println(aChar);
//            }
//        }

//        String substring = java.substring(3);
//        String substring2 = java.substring(3, 10);
//
//
//        System.out.println(substring);
//        System.out.println(substring2);


        String string = "\n hello world11111232345! \n";

//        System.out.println(string);
//
        string = string.trim();
//
//        System.out.println(string);

//        String replace = string.replace("1", "?");
//        String replace2 = string.replaceAll("[^0-9]", "");
//
//
//        System.out.println(replace);
//        System.out.println(replace2);

        String text = "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.";

        String[] split = text.split(" ");

//        for (String s1 : s) {
//            System.out.println(s1);
//        }


        Integer number = Integer.parseInt("123");

        String x = String.valueOf(number);
//        System.out.println(x);

//        StringBuilder builder = new StringBuilder(java);
//        StringBuilder builder2 = new StringBuilder(java);

//        System.out.println(builder);

//        System.out.println(java == builder2.toString());
//        System.out.println(builder == builder2);
//        System.out.println(builder.equals(builder2));
//        System.out.println(java.equals(builder2.toString()));
//        System.out.println(java.equals(builder2));


        StringBuilder builder = new StringBuilder("Programming");

//        for (String word : split) {
//            builder.append(word)
//                    .append(", ");
//        }

//        System.out.println(builder);

//        String updatedString = builder.toString();

//        System.out.println(builder.reverse());


        builder.insert(4, "St.-Petersburg");
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer();

    }
}
