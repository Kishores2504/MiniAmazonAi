package com.example.Ai_Project_Amazon.Entitiy;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;

@Entity
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryid;
	private String categoryname;
	private String iamgename;
	private String imagetype;
	@Lob
	private byte[] imagedata; 
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
//	List<ProductEntity> productlist;

	public CategoryEntity(String categoryname, String iamgename, String imagetype, byte[] imagedata) {
		this.categoryname = categoryname;
		this.iamgename = iamgename;
		this.imagetype = imagetype;
		this.imagedata = imagedata;
//		List<ProductEntity> productlist
//		this.productlist = productlist;
	}
	public CategoryEntity() {}
	
	public int getCategoryid() {
		return categoryid;
	}
	
	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getIamgename() {
		return iamgename;
	}

	public void setIamgename(String iamgename) {
		this.iamgename = iamgename;
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

//	public List<ProductEntity> getProductlist() {
//		return productlist;
//	}
//
//	public void setProductlist(List<ProductEntity> productlist) {
//		this.productlist = productlist;
//	}
	
	
}
