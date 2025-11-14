package com.example.Ai_Project_Amazon.Entitiy;

import org.springframework.context.annotation.Bean;

import jakarta.persistence.Entity;

@Entity
public class UserEntity {
	private long user_id;
	private String user_name;
	private String user_email;
	private String user_password;
	private long user_phonenumber;
	private String imagename;
	private String imagetype;
	private byte[] imagedata;
	
	

}
