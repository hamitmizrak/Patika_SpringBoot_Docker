package com.hamitmizrak;

import com.hamitmizrak.entity.ProductEntity;
import com.hamitmizrak.repository.ProductRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatikaSpringBootDockerApplicationTests {



    //Herşeyden önce
    @BeforeAll
    static  void getBeforeAll(){
        System.out.println("@SpringBootTest Herşeyden Öncesi gelir==> BeforeAll ==>");
    }


    //Herşeyden sonra
    @AfterAll
    static void getAfterAll(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("@SpringBootTest Herşeyden Sonra gelir ==AfterAll==> ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }


}
