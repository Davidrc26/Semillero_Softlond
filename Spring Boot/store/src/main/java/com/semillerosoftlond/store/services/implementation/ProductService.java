package com.semillerosoftlond.store.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import com.semillerosoftlond.store.repositories.contracts.IProductRepository;
import com.semillerosoftlond.store.services.contracts.IProductService;
import com.semillerosoftlond.store.entities.Product;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public ResponseEntity<List<Product>> findAll() {
     
        ResponseEntity<List<Product>> response = new ResponseEntity<>(HttpStatus.OK);
        List<Product> products = this.productRepository.findAll();
        response= new ResponseEntity<List<Product>>(products, HttpStatus.OK);
        return response;
    }
    
}
