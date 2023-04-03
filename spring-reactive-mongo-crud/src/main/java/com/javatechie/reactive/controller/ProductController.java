package com.javatechie.reactive.controller;


import com.javatechie.reactive.dto.ProductDto;
import com.javatechie.reactive.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


import java.time.Duration;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    private ProductService service;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ProductDto> getProducts(){

        return service.getProducts().delayElements(Duration.ofMillis(1000));
    }

    @GetMapping("/{id}")
    public Mono<ProductDto> getProduct(@PathVariable String id){

        return service.getProduct(id);
    }

    @GetMapping("/product-range")
    public Flux<ProductDto> getProductBetweenRange(@RequestParam("min") double min,@RequestParam("max") double max){

        return service.getProductInRange(min,max);
    }


    @PostMapping
    public Mono<ProductDto> saveProduct(@RequestBody Mono<ProductDto> productDtoMono){

        return service.saveProduct(productDtoMono);
    }

    @PutMapping("/update/{id}")
    public Mono<ProductDto> saveProduct(@RequestBody Mono<ProductDto> productDtoMono,@PathVariable String id){

        return service.updateProduct(productDtoMono,id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteProduct(@PathVariable String id){
        return service.deleteProduct(id);
    }

}
