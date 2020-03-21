package com.hmtmcse.tmutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TStringUtil {

    public static String removeEndChar(String content, String endChar) {
        if (content != null && endChar != null && content.endsWith(endChar) && !endChar.equals("")) {
            return content.substring(0, content.length() - 1);
        }
        return content;
    }

    public static String removeStartChar(String content, String startChar) {
        if (content != null && startChar != null && !startChar.equals("") && content.startsWith(startChar)) {
            return content.substring(1);
        }
        return content;
    }

    public static String trimStartEndChar(String content, String character) {
        if (content != null && character != null && !character.equals("")) {
            content = removeEndChar(content, character);
            return removeStartChar(content, character);
        }
        return content;
    }

    public static String[] split(String content, String character) {
        if (content != null && character != null && !character.equals("")) {
            return content.split(character);
        }
        return new String[0];
    }

    public static List<String> splitAsList(String content, String character) {
        String[] data = split(content, character);
        if (data.length != 0) {
            return Arrays.asList(data);
        }
        return new ArrayList<>();
    }

    public static List<String> reverseList(List<String> list) {
        if (list != null && list.size() != 0) {
            list = new ArrayList<>(list);
            Collections.reverse(list);
        }
        return list;
    }

}
