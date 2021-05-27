package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> getProducts(){
		return productService.getProducts();
	}

	//Get a product 
	@GetMapping("{productid}")
	public Product getProduct(@PathVariable("productid") Integer productId) {
		return productService.getProduct(productId);
		

	}

	// Delete a Product
	@DeleteMapping("{productId}")
	public String deleteProduct(@PathVariable("productId") Integer productId) {
		productService.deleteProduct(productId);
		return "Product Deleted !!";

	}

	// Update the Product
	@PutMapping
	public String updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
		return "Product Updated !!";

	}

	// Saving a single Product
	@PostMapping
	public String saveProduct(@RequestBody Product product) {
		System.out.println("Save Product Recieved: " + product);
		productService.saveProduct(product);
		return "Saving Product ";

	}

}
