package org.fizzbuzz

import spock.lang.Specification

class FizzBuzzSpec extends Specification {

    def "test toFizzBuzz input : #scenario"() {
        given:
        def fizzBuzz = new FizzBuzz()

        def result = fizzBuzz.toFizzBuzz(scenario)
        println "result = $result"

        expect:
        result == expectedResult

        where:
        scenario | expectedResult
        1        | '1'
        2        | '2'
        3        | 'Fizz'
        5        | 'Buzz'
        11       | '11'
        15       | 'FizzBuzz'

    }

    def 'test process FizzBuzz #scenario'() {
        given:
        def fizzBuzz = new FizzBuzz()

        def result = fizzBuzz.process(start, end)
        println "result = $result"

        expect:
        result == expectedResult

        where:
        scenario      | start | end | expectedResult
        'Range 1-5'   | 1     | 5   | ['1', '2', 'Fizz', '4', 'Buzz']
        'Range 11-15' | 11    | 15  | ['11', 'Fizz', '13', '14', 'FizzBuzz']
    }

}