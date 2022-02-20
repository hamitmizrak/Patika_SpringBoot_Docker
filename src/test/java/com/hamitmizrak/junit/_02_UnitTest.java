package com.hamitmizrak.junit;

import org.junit.jupiter.api.*;

public class _02_UnitTest {

    private static String data;
    //void olmalı

    @BeforeAll
    static  void getBeforeAll(){
        data="5";
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Herşeyden Öncesi gelir==> BeforeAll ==>"+data);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @AfterAll
     static void getAfterAll(){
        data=null;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Herşeyden Sonra gelir ==AfterAll==> "+data);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @BeforeEach//Testten hemen önce
    void getBeforeEach(){
        System.out.println("Her hangi birşeyden önce ==> BeforeEach");
    }

    @Test // @AfterEach ile @BeforeEach arasındadır
    void getTest(){
        System.out.println("@Test data: "+data);
    }

    @AfterEach //Testten hemen sonra
    void getAfterEach(){
        System.out.println("Her hangi birşeyden sonra ==> AfterEach");
    }



    @Test
    void getFail(){
        Assertions.fail("Fail sonuçu");
    }

    @Test
    @Disabled("disable")//calışmayacak test
    void getDisable(){
        System.out.println("@Disable data: "+data);
    }



}
