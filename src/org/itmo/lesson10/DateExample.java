package org.itmo.lesson10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(date);

//        Date date2 = new Date(0);
//        System.out.println(date2);

//        Calendar calendar = new GregorianCalendar();
//        System.out.println(calendar);

//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

//        Date someDate = null;
//        try {
//            someDate = dateFormat.parse("2010-05-23T09:01:02");
//        } catch (ParseException e) {
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(someDate);
//
//        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.of("Asia/Gaza"));
//        System.out.println(zonedDateTime);

//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        String format = dateFormat.format(date);
//        System.out.println(format);

        LocalDateTime now  = LocalDateTime.now();
//        System.out.println(now);

        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);


        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);

        LocalDateTime dateTime = LocalDateTime.of(2015, Month.MAY, 3, 12, 15, 30);
//        System.out.println(dateTime);

        LocalDate someDate = localDate.plusMonths(60);
//        System.out.println(someDate);

//        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
//        LocalDate parsedDate = LocalDate.parse("2031-02-02");
//        System.out.println(parsedDate);

//        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Gaza"));
//        System.out.println(zonedDateTime);

        Period period = Period.between(localDate, someDate);

//        System.out.println(period.getYears());

//        LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
//
//        int i = localTime.get(ChronoField.MINUTE_OF_DAY);
//        System.out.println(i);


    }

    public Date convertToDateViaSqlTimeStamp(LocalDateTime localDateTime) {
        return java.sql.Timestamp.valueOf(localDateTime);
    }

    public Date convertToDateViaSqlDate(LocalDate localDate) {
        return java.sql.Date.valueOf(localDate);
    }


}
