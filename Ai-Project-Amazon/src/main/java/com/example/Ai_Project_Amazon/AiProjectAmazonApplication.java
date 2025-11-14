package com.example.Ai_Project_Amazon;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
//{
@SpringBootApplication
// -> is a meta annotation (combination of annotation) which marks the entry point(class) of
// spring boot application.

// -> @SpringBootConfiguration , @EnableAutoConfiguration , @ComponentScan

//-> @Configuration -> says the spring that this class contains @Bean definitions @Bean will 
// register the method's return value(Objects) as beans inside the Application Context(Spring Container)
// Internal - when spring starts , it looks for configuration class and it build bean factors to manage them
// so when a class is dependent on another config class method spring inject it automatically.

//-> @
//}
public class AiProjectAmazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiProjectAmazonApplication.class, args);
	}

}
