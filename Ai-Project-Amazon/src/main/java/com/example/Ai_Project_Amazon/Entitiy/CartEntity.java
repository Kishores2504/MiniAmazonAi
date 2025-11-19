package com.example.Ai_Project_Amazon.Entitiy;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CartEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartid;
//	@ManyToOne
//	@JoinColumn(name = "productid")
//	private ProductEntity product ;
//	@ManyToOne
//	@JoinColumn(name =  "userid")
//	private UserEntity user;
	private int count;
	private double finalcartamount;
	
	public CartEntity(int count, double finalcartamount) {
//		ProductEntity product, UserEntity user,
//		this.product = product;
//		this.user = user;
		this.count = count;
		this.finalcartamount = finalcartamount;
	}
	public CartEntity() {}
	
	public int getCartid() {
		return cartid;
	}
	
//	public ProductEntity getProduct() {
//		return product;
//	}
//	public void setProduct(ProductEntity product) {
//		this.product = product;
//	}
//	public UserEntity getUser() {
//		return user;
//	}
//	public void setUser(UserEntity user) {
//		this.user = user;
//	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getFinalcartamount() {
		return finalcartamount;
	}
	public void setFinalcartamount(double finalcartamount) {
		this.finalcartamount = finalcartamount;
	};
	
	
}
