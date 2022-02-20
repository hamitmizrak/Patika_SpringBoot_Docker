package com.hamitmizrak.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _01_HelloWorldTest {

    private _01_HelloWorldMain helloWorldMain;

    //her defasında instance yapmamak için
    @BeforeEach
    void setUp() {
        helloWorldMain = new _01_HelloWorldMain();
    }

    //Test1
    @Test
    void birinciTest(){
        Assertions.assertEquals(
                "Merhabalar", helloWorldMain.test1(),"Zannediyorum bir yanlışlık var");
    }

    //fizz buzz örneği 4  ve 5 sayıları  (1 ile 50 arasında)
    //fizz
    @Test
    void ikinciTest() {//4'e bölünürse
        Assertions.assertEquals("fizz", helloWorldMain.fizBuzzMethod(4), "4'ebölünemedi");
    }

    //buzz
    @Test
    void ucuncuTest() {//5'e bölünürse
        Assertions.assertEquals("buzz", helloWorldMain.fizBuzzMethod(5), "5'ebölünemedi");
    }

    // fizzbuzz
    @Test
    void dorduncuTest() {//hem 4 hemde 5 bölünürse fizzbuzz
        Assertions.assertEquals("fizzbuzz", helloWorldMain.fizBuzzMethod(20), "20'ebölünemedi");
    }

    // sayı kendisi
    @Test
    void besinciTest() {//hem 4 hemde 5 bölünemedi sayının kendisi
        Assertions.assertEquals("7", helloWorldMain.fizBuzzMethod(7), "4 ve 5 bölünemedi");
    }

    //IllegalExcepiton
    @Test
    void altinciTest() { //1 altında küçük sayı girilise
        Assertions.assertThrows(IllegalArgumentException.class, () -> helloWorldMain.fizBuzzMethod(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> helloWorldMain.fizBuzzMethod(51));
    }



}
