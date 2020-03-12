package com.hmtmcse.tmutil.test;

import com.hmtmcse.tmutil.TomTom;

public class Main {
    public static void main(String[] args) {
        System.out.println(TomTom.concatWithSeparator("ws://localhost:6601/", "/miavai/", "/"));
        System.out.println(TomTom.concatWithSeparator("ws://localhost:6601", "/miavai/", "/"));
        System.out.println(TomTom.concatWithSeparator("ws://localhost:6601/", "miavai/", "/"));
        System.out.println(TomTom.concatWithSeparator("ws://localhost:6601", "miavai/", "/"));
    }

}
