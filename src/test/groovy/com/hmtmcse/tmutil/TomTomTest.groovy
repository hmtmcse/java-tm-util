package com.hmtmcse.tmutil

import spock.lang.Specification

class TomTomTest extends Specification {

    def "Check URL Concatenation"() {

        given:
        String baseUrl = "/task/to/do"
        String prefix = "/home"

        expect: "Check URL Concatenation"
        println(TomTom.concatUrl(baseUrl, prefix))
    }

}
