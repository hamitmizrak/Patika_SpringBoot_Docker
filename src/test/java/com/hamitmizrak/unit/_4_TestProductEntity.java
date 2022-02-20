package com.hamitmizrak.unit;

import com.hamitmizrak.entity.ProductEntity;
import com.hamitmizrak.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class _4_TestProductEntity {

    @Autowired
    ProductRepository productRepository;

    //CREATE
    @Test
    void createTest(){
        ProductEntity productEntity=new ProductEntity();
        productEntity.setProductName("ürün adı 44");
        productEntity.setProductTrade("ürün markası 44");
        productRepository.save(productEntity);
        Assertions.assertNotNull(productRepository.findById(1L).get());
    }

    //LIST
    @Test
    void listTest(){
        List<ProductEntity> listem=productRepository.findAll();
       assertThat(listem).size().isGreaterThan(0);
    }

    //FIND
    @Test
    void findTest(){
        ProductEntity find=productRepository.findById(1L).get();
        assertEquals("ürün adı 44",find.getProductName()  );
    }

    //UPDATE
    @Test
    void updateTest(){
        ProductEntity update=productRepository.findById(1L).get();
        update.setProductTrade("değiştirdim");
        productRepository.save(update);
        assertNotEquals("eski yapı",update.getProductTrade());
    }

    //DELETE
    @Test
    void deleteTest(){
        productRepository.deleteById(1L);
        assertThat(productRepository.existsById(1L)).isFalse();
    }



}
