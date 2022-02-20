package com.hamitmizrak.junit;

import com.hamitmizrak.entity.ProductEntity;
import com.hamitmizrak.repository.ProductRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//UNUTMA her testin başına yazıyorsun
@SpringBootTest
public class _04_Crud {


    @Autowired
    ProductRepository productRepository;

    //Herşeyden önce
    @BeforeAll
    static  void getBeforeAll(){
        System.out.println("Herşeyden Öncesi gelir==> BeforeAll ==>");
    }

    //CREATE
    @Test
    public void create(){
        ProductEntity productEntity=new ProductEntity();
        productEntity.setProductName("ürün 44");
        productEntity.setProductTrade("ürün marka 44");
        productRepository.save(productEntity);
        // nesne null ise assertionError hatası fırlatır.
        assertNotNull(productRepository.findById(1L).get());
    }



    //LIST
    @Test
    public void list() {
        List<ProductEntity> list = productRepository.findAll();
        //isGreaterThan sıfırdan büyükse
        assertThat(list).size().isGreaterThan(0);
    }

    //FIND
    @Test
    public void findById() {
        ProductEntity productEntity=   productRepository.findById(1L).get();
        //assertEquals: eşitse
        assertEquals("ürün marka 44",productEntity.getProductTrade());
    }

    //UPDATE
    @Test
    public void update(){
        ProductEntity productEntity=  productRepository.findById(1L).get();
        productEntity.setProductName("ürün 44");
        productRepository.save(productEntity);
        //assertEquals: eşit değilse bir soun olmayacak ama eşitse excepiton fırlatmalı
        assertNotEquals("eskisi",productRepository.findById(1L).get().getProductName());
    }


    //DELETE
    @Test
    public void delete(){
        // ProductEntity productEntity=  productRepository.findById(2L).get();
        productRepository.deleteById(1L);
        //isFalse: yanlış mı
        assertThat(productRepository.existsById(1L)).isFalse();
    }


    //Herşeyden sonra
    @AfterAll
    static void getAfterAll(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Herşeyden Sonra gelir ==AfterAll==> ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
