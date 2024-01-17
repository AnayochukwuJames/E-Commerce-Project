package com.example.ecommerceproject.service.serviceImp;

import com.example.ecommerceproject.builder.ProductMapper;
import com.example.ecommerceproject.dto.ProductResponse;
import com.example.ecommerceproject.model.Product;
import com.example.ecommerceproject.repository.ProductRepository;
import com.example.ecommerceproject.service.ProductService;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        List<ProductResponse> product = productRepository.findAll().stream()
                .map(ProductMapper:: mapProductResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(product,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ProductResponse> getProductById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("product not fund"));
        return new ResponseEntity<>(ProductMapper.mapProductResponse(product), HttpStatus.OK);

    }
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
    @Override
    public ResponseEntity<String> deleteProduct(Long id){
        productRepository.deleteById(id);
        return new ResponseEntity<>("user deleted Successfully", HttpStatus.OK);
    }

}
