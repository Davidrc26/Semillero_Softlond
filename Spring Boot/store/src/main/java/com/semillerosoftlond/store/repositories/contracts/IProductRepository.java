package com.semillerosoftlond.store.repositories.contracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semillerosoftlond.store.entities.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{
    
}
