package com.example.Ai_Project_Amazon.Entitiy;

import org.springframework.context.annotation.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

//	Spring creates entitymanagerfactory because of the configuration of 
//	spring-starter-data-jpa in this spring boot autoconfig loads HibernateJpaAutoConfiguration
// 	this creates " LocalContainerEntityManagerFactoryBean " " Hibernate configuration " and
// 	" Jpa Properties " 
// 	this factory is responsible for -> Scanning entity , building meta data , create persistence
// 	context , create hibernate session factory.
//	JPA EntityManagerFactory + Hibernate scanner finds these entity

// 	explanation -> app starts - spring create hibernate factory - hibernate scans packages 
// 	and find entity - prepare them for database usage - hibernate checks if the entity is 
// 	valid or not (inside fields like @id , @mapping etc.) - hibernate creates a internal 
// 	table model - depending on ddl auto : create/update it changes - some of proxy classes
//  - now spring data jpa can use the inbuild methods like save deletebyid findbyid..

@Entity
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String user_name;
	private String user_email;
	private String user_password;
	private long user_phonenumber;
	private String imagename;
	private String imagetype;
	@Lob
	private byte[] imagedata;
	
	@Enumerated(EnumType.STRING)
	private Roles role;
	
	public UserEntity() {};
	
	public UserEntity(
			String username,
			String useremail , 
			String userpassword , 
			long phonenumber, 
			String imagename , 
			String imagetype ,
			byte[] imagedata,
			Roles role) {
		this.user_name = username;
		this.user_email = useremail;
		this.user_password = userpassword;
		this.user_phonenumber = phonenumber;
		this.imagename = imagename;
		this.imagetype = imagetype;
		this.imagedata = imagedata;
		this.role = role;
	}
	
	public int getuserid() {
		return user_id;
	}
	
	public void setUsername(String username) {
		this.user_name = username;
	}
	public String getUsername() {
		return user_name;
	}
	 
	public void setUseremail(String useremail) {
		this.user_email = useremail;
	}
	public String getUseremail() {
		return user_email;
	}
	
	public void setUserpassword(String password) {
		this.user_password = password;
	}
	public String getUserpassword() {
		return user_password;
	}
	
	public void setUserphonenumber(long phonenumber) {
		this.user_phonenumber = phonenumber;
	}
	public long getUserphonenumber() {
		return user_phonenumber;
	}
	
	public void setimagename(String imagename) {
		this.imagename = imagename;
	}
	public String getimagename() {
		return imagename;
	}
	
	public void setimagetype(String imagetype) {
		this.imagetype = imagetype;
	}
	public String getimagetype() {
		return imagetype;
	}
	
	public void setimagedata(byte[] imagedata) {
		this.imagedata = imagedata;
	}
	public byte[] getimagedata() {
		return imagedata;
	}
	
	public void setUserrole(Roles role) {
		this.role = role;
	}
	public Roles getUserrole() {
		return role;
	}
}
