package com.hamitmizrak.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sonuç")
public class _03_UnitTest {


    @Test
    @DisplayName(  "Emojiler ")
    void emoji(){
    }


    @Test
    void isResult(){
        _03_UnitMain unit3= new _03_UnitMain();
        Assertions.assertTrue( unit3.isMainResult());
    }




}
