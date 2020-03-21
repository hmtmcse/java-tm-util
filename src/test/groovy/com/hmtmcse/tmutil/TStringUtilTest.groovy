package com.hmtmcse.tmutil

import spock.lang.Specification

class TStringUtilTest extends Specification {

    def "End Char truncate"() {
        expect: "End Char truncate"
        println(TStringUtil.removeEndChar("/path/to/file/", "/"))
        println(TStringUtil.removeEndChar("/path/to/file/", null))
        println(TStringUtil.removeEndChar(null, "/"))
    }

    def "Start Char truncate"() {
        expect: "Start Char truncate"
        println(TStringUtil.removeStartChar("/path/to/file/", "/"))
        println(TStringUtil.removeStartChar("/path/to/file/", null))
        println(TStringUtil.removeStartChar(null, "/"))
    }

    def "Trim start and end Char truncate"() {
        expect: "Trim start and end Char truncate"
        println(TStringUtil.trimStartEndChar("/path/to/file/", "/"))
        println(TStringUtil.trimStartEndChar("/path/to/file/", ""))
        println(TStringUtil.trimStartEndChar("/path/to/file/", null))
        println(TStringUtil.trimStartEndChar(null, "/"))
    }

    def "Test String split"() {
        expect: "Test String split"
        println(TStringUtil.split(TStringUtil.trimStartEndChar("/path/to/file/", "/"), "/"))
        println(TStringUtil.split("/path/to/file/", "/"))
        println(TStringUtil.split("/path/to/file/", null))
        println(TStringUtil.split(null, "/"))
    }

    def "Test String split as list"() {
        expect: "Test String split as list"
        println(TStringUtil.splitAsList(TStringUtil.trimStartEndChar("/path/to/file/", "/"), "/"))
    }

    def "Test reverse list"() {
        expect: "Test String split as list"
        def list = TStringUtil.splitAsList(TStringUtil.trimStartEndChar("/path/to/file/", "/"), "/")
        println(TStringUtil.reverseList(list))
        println(list)

    }
}
