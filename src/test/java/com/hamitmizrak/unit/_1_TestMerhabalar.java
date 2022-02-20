package com.hamitmizrak.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _1_TestMerhabalar {

    @Test
    void birinciTest(){
        _1_MainMerhabalar mainMerhabalar=new _1_MainMerhabalar();
        Assertions.assertEquals("Merhabalar44",mainMerhabalar.success(),"iki kelime aynı değildir");
    }



}
