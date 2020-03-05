package com.hmtmcse.tmutil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

public class TomTom {

    public static Integer randomInteger() {
        Random rnd = new Random();
        return 100000 + rnd.nextInt(999999);
    }

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static String randomString(Integer number) {
        return uuid().substring(0, number).replaceAll("-", "");
    }

    public static String random15Char() {
        return randomString(15);
    }

    public static String formatDateTime(String pattern, LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        if (localDateTime == null) {
            return null;
        }
        return localDateTime.format(dateTimeFormatter);
    }

    public static String formatCurrentDateTime(String pattern) {
        return formatDateTime(pattern, LocalDateTime.now());
    }

    public static String currentDateTime() {
        return formatCurrentDateTime("dd-MM-yyyy_HH-mm-ss");
    }
}
