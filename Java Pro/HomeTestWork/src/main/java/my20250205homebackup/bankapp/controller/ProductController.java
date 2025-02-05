package de.telran.bankapp.controller;

import de.telran.bankapp.entity.Client;
import de.telran.bankapp.entity.Product;
import de.telran.bankapp.entity.enums.CurrencyCode;
import de.telran.bankapp.entity.enums.ProductStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {
    List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1L, "Current Account", CurrencyCode.EUR, 2.0, new BigDecimal("1500.75"), ProductStatus.ACTIVE));
        products.add(new Product(2L, "Credit Account", CurrencyCode.USD, 18.0, new BigDecimal("5000.0"), ProductStatus.ACTIVE));
        products.add(new Product(3L, "Business Credit", CurrencyCode.USD, 18.0, new BigDecimal("20000.0"), ProductStatus.INACTIVE));
    }

    //    - REST запрос на вывод списка всех продуктов
    @GetMapping("/")
    public List<Product> getProducts() {
        return products;
    }

    //- REST запрос на вывод одного продукта по id -------------------------------------
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }

    //- REST запрос на добавление продукта
    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        products.add(product);
        return ResponseEntity.ok(product);
    }

    //- REST запрос на обновление информации о продукте -------------------------

    //- REST запрос на удаление продукта
    @DeleteMapping()
    public ResponseEntity<Product> deleteProduct(@RequestParam Long id) {
        products.removeIf(product -> product.getId().equals(id));
        return ResponseEntity.accepted().build();
    }

    //- REST запрос на поиск продукта по валюте и статусу
    @GetMapping("/search")
    public List<Product> searchProduct(@RequestParam CurrencyCode currencyCode, @RequestParam ProductStatus status) {
        return products.stream().filter(product -> product.getStatus().equals(status)).filter(code -> currencyCode.equals(currencyCode)).collect(Collectors.toList());
    }

    //- REST запрос на обновление информации о продукте
    @PutMapping
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        Long id = product.getId();
        Optional<Product> optional = products.stream().filter(p -> p.getId().equals(id)).findAny();
        if (optional.isPresent()) {
            Product found = optional.get();
            found.setName(found.getName());
            found.setStatus(found.getStatus());
            found.setCurrencyCode(found.getCurrencyCode());
            found.setInterestRate(found.getInterestRate());
            found.setLimitAmount(found.getLimitAmount());
            return new ResponseEntity<>(found, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    //- REST запрос на удаление всех неактивных продуктов
    @DeleteMapping("/del")
//    public List<Product> deleteInactiveProducts(){
//            for (Product p : products){
//                if((p.getStatus()).equals("INACTIVE")){
//                    products.remove(p);
//                }
//          return products;
//    }
    public ResponseEntity<Void> deleteInactiveProducts(){
        products.removeIf(product ->product.getStatus().equals(ProductStatus.INACTIVE));
        return ResponseEntity.accepted().build();
    }


}