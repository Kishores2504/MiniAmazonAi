package com.example.Ai_Project_Amazon.Entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ReviewEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reviewid;
	private String review;
//	@ManyToOne
//	@JoinColumn(name = "userid")
//	private UserEntity user;
//	@ManyToOne 
//	@JoinColumn(name = "productid")
//	private ProductEntity product;
	
	public ReviewEntity(String review) {
		this.review = review;
//		, UserEntity user, ProductEntity product
//		this.user = user;
//		this.product = product;
	}
	
	public ReviewEntity() {}
	
	public int getreviewid() {
		return reviewid;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

//	public UserEntity getUser() {
//		return user;
//	}
//
//	public void setUser(UserEntity user) {
//		this.user = user;
//	}
//
//	public ProductEntity getProduct() {
//		return product;
//	}
//
//	public void setProduct(ProductEntity product) {
//		this.product = product;
//	}
	
	
	
}
