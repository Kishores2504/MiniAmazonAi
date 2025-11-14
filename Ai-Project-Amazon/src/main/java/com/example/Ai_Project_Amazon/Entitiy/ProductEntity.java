package com.example.Ai_Project_Amazon.Entitiy;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long product_id;
	private String product_name;
	private String description;
	private Date product_posted_date;
	private Date expiry_date;
	private Date manufactured_date;
	private String imagename;
	private String imagetype;
	@Lob
	private byte[] imagedata;
	
}
