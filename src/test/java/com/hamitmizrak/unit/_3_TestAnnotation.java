package com.hamitmizrak.unit;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class _3_TestAnnotation {


    @BeforeAll
    static void herSeydenOnce(){
        System.out.println("Herşeyden önce");
    }

    @BeforeEach
     void testenHemenOnce(){
        System.out.println("Testten hemen önce");
    }



    @Test
   // @Disabled
    void birinciTest(){
        _1_MainMerhabalar mainMerhabalar=new _1_MainMerhabalar();
        Assertions.assertEquals("Merhabalar44",mainMerhabalar.success(),"iki kelime aynı değildir");
    }

   /* @Test
    void hataolsun(){
        Assertions.fail("Fail oluştur !!!!");
    }*/


    @AfterEach
    void testenHemenSonra(){
        System.out.println("Testten hemen sonra");
    }


    @AfterAll
    static void herSeydenSonra(){
        System.out.println("Herşeyden sonra");
    }

}
