package com.hamitmizrak.junit;

public class _01_HelloWorldMain {

    //MainTest1
    public String test1() {
        return "Merhabalar";
    }

    //MainTest2
    public String fizBuzzMethod(int i) {
        if (i < 0 || i > 50) {
            throw new IllegalArgumentException();
        }
        if (i % 20 == 0) {
            return "fizzbuzz";
        }
        if (i % 4 == 0) {
            return "fizz";
        }
        if (i % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(i);//sayının kendisini döndürdüm
    }
}
