package com.semillerosoftlond.store.services.contracts;
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.semillerosoftlond.store.entities.Product;

public interface IProductService {
    public ResponseEntity<List<Product>>findAll();
}
