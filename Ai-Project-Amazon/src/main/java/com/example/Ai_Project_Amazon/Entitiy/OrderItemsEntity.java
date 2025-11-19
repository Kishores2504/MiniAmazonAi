package com.example.Ai_Project_Amazon.Entitiy;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItemsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderitemid;
//	@ManyToOne
//	@JoinColumn(name = "finalorderid")
//	@JsonIgnore
//	private FinalOrderEntity finalorderid;
//	@ManyToOne 
//	@JoinColumn(name = "productid")
//	private ProductEntity productid;
	private int quantity;
	private double price;
	
	public OrderItemsEntity( int quantity, double price) {
//		FinalOrderEntity finalorderid, ProductEntity productid,
//		this.finalorderid = finalorderid;
//		this.productid = productid;
		this.quantity = quantity;
		this.price = price;
	}
	public OrderItemsEntity() {}
	
	public int getOrderitemsid() {
		return orderitemid;
	}
//	public FinalOrderEntity getFinalorderid() {
//		return finalorderid;
//	}
//	public void setFinalorderid(FinalOrderEntity finalorderid) {
//		this.finalorderid = finalorderid;
//	}
//	public ProductEntity getProductid() {
//		return productid;
//	}
//	public void setProductid(ProductEntity productid) {
//		this.productid = productid;
//	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
