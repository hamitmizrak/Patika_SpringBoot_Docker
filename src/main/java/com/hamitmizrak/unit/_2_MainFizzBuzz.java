package com.hamitmizrak.unit;

public class _2_MainFizzBuzz {



    public String result(int number) {

        if(number<0 || number>50)
            throw new IllegalArgumentException();

        //4 ve 5 = 20
        if(number%20==0)
            return "FIZZBUZZ";

        // 4 bölündü
        if(number%4==0)
            return "FIZZ";

        //5'e bölündü
        if(number%5==0)
            return "BUZZ";

        //sayının kendini
        return String.valueOf(number) ;
    }
}
