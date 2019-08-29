package com.ecofoo.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class TimeFormat {
    public static void main(String[] args) throws ParseException {
        String date1 = "2019-07-09 15:50:00";
        String date2 = "2019-07-09 16:00:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d1 = sdf.parse(date1);
        Date d2 = sdf.parse(date2);

        Duration diff = Duration.between(d1.toInstant(), d2.toInstant());

        System.out.println("Hours => " + diff.toHours() + "; minutes => " + diff.toMinutes() + "; h=" + diff.toMinutes() / 60.0);
    }
}
