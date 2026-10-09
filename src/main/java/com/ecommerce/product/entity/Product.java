package com.ecommerce.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "Products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String descrption;
	private String price;
	private String quantity;
	private String Category;
	
	public Product() {
		
	}

	public Product(Long id, String name, String descrption, String price, String quantity, String category) {
		super();
		this.id = id;
		this.name = name;
		this.descrption = descrption;
		this.price = price;
		this.quantity = quantity;
		Category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", descrption=" + descrption + ", price=" + price
				+ ", quantity=" + quantity + ", Category=" + Category + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getDescrption()=" + getDescrption() + ", getPrice()=" + getPrice() + ", getQuantity()="
				+ getQuantity() + ", getCategory()=" + getCategory() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
