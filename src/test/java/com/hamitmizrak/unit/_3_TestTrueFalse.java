package com.hamitmizrak.unit;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class _3_TestTrueFalse {


    @Test
    void trueAndFalseTutorialsTest(){
        _3_MainTrueFalse mainMerhabalar=new _3_MainTrueFalse();
        Assertions.assertTrue(mainMerhabalar.isTrue());
    }




}
