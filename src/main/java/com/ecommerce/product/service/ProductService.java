package com.ecommerce.product.service;

import org.springframework.stereotype.Service;

import com.ecommerce.product.entity.Product;
import com.ecommerce.product.repository.ProductRepository;
import com.sun.tools.javac.util.List;


@Service
public class ProductService {
	
	public final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}
	
	public Product addProduct(Product product) {
		
		return productRepository.save(product);
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public ProductService updateProduct(Long id,Product product) {
		product.setId(id);
		return productRepository.save(product);
	}
	
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
	

}
