package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	/*
	 * private List<Product> products = new ArrayList<Product>(Arrays.asList(new
	 * Product(1, "Mouse", 10, 100), new Product(2, "Keyboard", 11, 200), new
	 * Product(3, "Laptop", 30, 30000)));
	 */
	public List<Product> getProducts() {
		return (List<Product>) productRepository.findAll();
	}

	public Product getProduct(Integer productId) {
		 Optional<Product> product= productRepository.findById(productId);
		//return products.stream().filter(t -> t.getProductId() == productId).findFirst().get();
		 return product.get();
	}

	// Saving a single Product
	public void saveProduct(Product product) {
		//products.add(product);
		productRepository.save(product);
	}

	// delete a product
	public void deleteProduct(Integer productId) {
		//products.removeIf(t -> t.getProductId() == productId);
		productRepository.deleteById(productId);

	}

	// Update a Product

	public void updateProduct(Product product) {
		/*
		 * for (int i = 0; i < products.size(); i++) { Product p = products.get(i); if
		 * (p.getProductId() == product.getProductId()) { products.set(i, product);
		 * return; } }
		 */
		productRepository.save(product);
	}
}
