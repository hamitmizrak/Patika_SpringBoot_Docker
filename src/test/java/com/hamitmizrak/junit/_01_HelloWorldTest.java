package com.hamitmizrak.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _01_HelloWorldTest {

    @Test
    void birinciTest(){
        _01_HelloWorldMain helloWordMain=new _01_HelloWorldMain(); //alt+enter
        Assertions.assertEquals(
                "Merhabalar",helloWordMain.test1(),"Zannediyorum bir yanlışlık var");

    }

}
