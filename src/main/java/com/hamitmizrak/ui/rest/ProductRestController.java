package com.hamitmizrak.ui.rest;

import com.hamitmizrak.entity.ProductEntity;
import com.hamitmizrak.exception.ResourceNotFoundException;
import com.hamitmizrak.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker/v1")
@CrossOrigin
public class ProductRestController {

    @Autowired
    ProductRepository productRepository;

    //EKLEME
    // http://localhost:8080/docker/v1/create/product
    @PostMapping("/create/product")
    public ResponseEntity<ProductEntity> addProduct(@RequestBody ProductEntity productEntity ){
        return ResponseEntity.ok(productRepository.save(productEntity))  ;
    }

    //SELECT
    // http://localhost:8080/docker/v1/list/product
    @GetMapping("/list/product")
    public ResponseEntity<List<ProductEntity>> findAll(){
        return ResponseEntity.ok(productRepository.findAll());
    }

    //BULMA
    // http://localhost:8080/docker/v1/find/product/1
    @GetMapping("/find/product/{id}")
    public ResponseEntity<ProductEntity>  findProductById(@PathVariable("id") Long id){
        ProductEntity productEntity=
                productRepository
                  .findById(id)
                  .orElseThrow(
                          ()->new ResourceNotFoundException(id+" numaralı product id bulunamadı !!!!")
                  );
        return ResponseEntity.ok(productEntity);
    }

    // SILME
    // http://localhost:8080/docker/v1/delete/product/1
    @DeleteMapping("/delete/product/{id}")
    public ResponseEntity<Void> deleteProductId(@PathVariable("id") Long id){
        ProductEntity productEntity=
                productRepository
                        .findById(id)
                        .orElseThrow(
                                ()->new ResourceNotFoundException(id+" numaralı product id bulunamadı !!!!")
                        );
        productRepository.delete(productEntity);
        return ResponseEntity.ok().build();
    }




}
