package com.example.Ai_Project_Amazon.Entitiy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class FinalOrderEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int finalorderid;
//	@OneToMany(mappedBy = "finalorderid")
//	private List<OrderItemsEntity> orderitems;
//	@ManyToOne
//	@JoinColumn(name = "userid")
//	private UserEntity user;
	@Enumerated(EnumType.STRING)
	private Status status;
	private LocalDateTime datetime;
	
	public FinalOrderEntity() {}
	
	public FinalOrderEntity( Status status,LocalDateTime datetime) {
//		List<OrderItemsEntity>orderitems , UserEntity user ,
//		this.orderitems = orderitems;
//		this.user = user;
		this.status = status;
		this.datetime = datetime;
	}
	
	public int getFinalOrderEntity() {
		return finalorderid;
	}

//	public List<OrderItemsEntity> getOrderitems() {
//		return orderitems;
//	}
//
//	public void setOrderitems(List<OrderItemsEntity> orderitems) {
//		this.orderitems = orderitems;
//	}
//
//	public UserEntity getUser() {
//		return user;
//	}
//
//	public void setUser(UserEntity user) {
//		this.user = user;
//	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	
}
