package com.hmtmcse.tmutil;

public  class TStringUtil {

    public static String removeEndChar(String content, String endChar){
        if (content != null && endChar != null && content.endsWith(endChar)){
            return content.substring(0, content.length() - 1);
        }
        return content;
    }

    public static String removeStartChar(String content, String startChar){
        if (content != null && startChar != null && content.startsWith(startChar)){
            return content.substring(1);
        }
        return content;
    }

    public static String trimStartEndChar(String content, String character) {
        if (content != null && character != null) {
            content = removeEndChar(content, character);
            return removeStartChar(content, character);
        }
        return content;
    }

}
