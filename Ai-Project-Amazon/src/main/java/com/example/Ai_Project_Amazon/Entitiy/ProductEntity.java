package com.example.Ai_Project_Amazon.Entitiy;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	private String product_name;
	private String description;
	private Date product_posted_date;
	private LocalDate manufactured_date;
	private LocalDate expiry_date;
	private String imagename;
	private String imagetype;
	@Lob
	private byte[] imagedata;
	
//	@ManyToOne
//	@JoinColumn(name = "categoryid")
//	private CategoryEntity category;
	
	
	ProductEntity(String productname, String description,LocalDate manufacturedate,LocalDate expirydate,
				String imagename, String imagetype , byte[] imagedata){
		this.product_name = productname;
		this.description = description;
		this.product_posted_date = new Date(System.currentTimeMillis());
		this.manufactured_date = manufacturedate;
		this.expiry_date = expirydate;
		this.imagename = imagename;
		this.imagetype = imagetype ;
		this.imagedata = imagedata;
	}

	public int getProduct_id() {
		return product_id;
	}
	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getProduct_posted_date() {
		return product_posted_date;
	}


	public void setProduct_posted_date(Date product_posted_date) {
		this.product_posted_date = product_posted_date;
	}


	public LocalDate getManufactured_date() {
		return manufactured_date;
	}


	public void setManufactured_date(LocalDate manufactured_date) {
		this.manufactured_date = manufactured_date;
	}


	public LocalDate getExpiry_date() {
		return expiry_date;
	}


	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}


	public String getImagename() {
		return imagename;
	}


	public void setImagename(String imagename) {
		this.imagename = imagename;
	}


	public String getImagetype() {
		return imagetype;
	}


	public void setImagetype(String imagetype) {
		this.imagetype = imagetype;
	}


	public byte[] getImagedata() {
		return imagedata;
	}


	public void setImagedata(byte[] imagedata) {
		this.imagedata = imagedata;
	}


//	public CategoryEntity getCategory() {
//		return category;
//	}
//
//
//	public void setCategory(CategoryEntity category) {
//		this.category = category;
//	}
	
	
}
