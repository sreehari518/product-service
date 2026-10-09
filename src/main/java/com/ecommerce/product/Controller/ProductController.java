package com.ecommerce.product.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.product.entity.Product;
import com.ecommerce.product.service.ProductService;
import com.sun.tools.javac.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

	
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product getproductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}
	
	@PutMapping("/{id}")
	public void updateProduct(@PathVariable Long id,@RequestBody Product product) {
		return ProductService.updateProduct(id,product);
	}
	
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
	
	
}
