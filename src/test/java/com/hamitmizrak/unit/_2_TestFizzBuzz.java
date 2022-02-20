package com.hamitmizrak.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2_TestFizzBuzz {


    //fizbuzz 0<=x<=50 arasında olsun
    //4 ile bölünebilebilen FIZZ
    //5 ile bölünebilebilen BUZZ
    //4 ve 5 ile bölünebilebilen FIZZBUZZ
    //4 ve 5 ile bölünmüyorsa kendi değerini döndürsün
    // 0 altında veya 50 üstündeyse IllegalArgumentException

    private _2_MainFizzBuzz mainFizzBuzz;
    @BeforeEach
    void setUp() {
        mainFizzBuzz = new _2_MainFizzBuzz();
    }

    @Test
    void equalsfourDivide(){
        Assertions.assertEquals("FIZZ", mainFizzBuzz.result(4),"4' bölünmüyor!!!!");
    }

    @Test
    void equalsfiveDivide(){
        Assertions.assertEquals("BUZZ",mainFizzBuzz.result(5),"5' bölünmüyor!!!!");
    }

    @Test
    void equalsFourAndfiveDivide(){
        Assertions.assertEquals("FIZZBUZZ",mainFizzBuzz.result(20),"4'e ve 5' bölünüyor 20' bölünmüyor!!!!");
    }

    @Test
    void notEqualsFourAndfiveDivide(){
        Assertions.assertEquals("7",mainFizzBuzz.result(7),"4'e ve 5' bölünmüyorrrrr !!!!");
    }


    @Test
    void specialNumber(){
        Assertions.assertEquals("7",mainFizzBuzz.result(7),"4'e ve 5' bölünmüyorrrrr !!!!");
        Assertions.assertThrows(IllegalArgumentException.class,()->mainFizzBuzz.result(-1));
        Assertions.assertThrows(IllegalArgumentException.class,()->mainFizzBuzz.result(59));
    }

}
