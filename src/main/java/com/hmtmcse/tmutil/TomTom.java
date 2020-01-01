package com.hmtmcse.tmutil;

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

    private static String randomString(Integer number) {
        return uuid().substring(0, number).replaceAll("-", "");
    }

    public static String random15Char() {
        return randomString(15);
    }
}
