package org.itmo.java.lesson13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();

//        System.out.println(date);

        Date date2 = new Date(0);

//        System.out.println(date2);

//        double years = (date.getTime() - date2.getTime()) / 1000.0 / 60 / 60 / 24 / 365;
//        System.out.println(new DecimalFormat("#.##").format(years));

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
//        System.out.println(calendar);

        Calendar calendar2 = Calendar.getInstance();
//        System.out.println(calendar2);

//        SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//        isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//        Date timeZoneDate = null;
//        try {
//            timeZoneDate = isoFormat.parse("2010-05-23T09:01:02");
//        } catch (ParseException e) {
//            System.err.println(e.getMessage());
//        }
//
//
//        System.out.println(timeZoneDate);


//        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.of("Africa/Tunis"));
//        System.out.println(zonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);


        LocalDateTime someDay = LocalDateTime.of(2015, 5, 3, 12, 15, 30);
//        System.out.println(someDay);


//        System.out.println(date);
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(dateFormat.format(date));


        String formattedDate = someDay.format(DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd"));
//        System.out.println(formattedDate);

        LocalDate someDate = localDate.plusMonths(50);

//        System.out.println(dateTime);

        Period period = Period.between(localDate, someDate);
        System.out.println(period.getYears());

    }

    public Date convertToDateViaSqlDate(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }

    public Date convertToDateViaSqlTimestamp(LocalDateTime dateToConvert) {
        return java.sql.Timestamp.valueOf(dateToConvert);
    }
}
