package com.example.Ai_Project_Amazon;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
//{
@SpringBootApplication
// -> is a meta annotation (combination of annotation) which marks the entry point(class) of
// spring boot application.

//-> @SpringBootConfiguration , @EnableAutoConfiguration , @ComponentScan

//-> @Configuration -> says the spring that this class contains @Bean definitions @Bean will 
// register the method's return value(Objects) as beans inside the Application Context(Spring Container)
// Internal - when spring starts , it looks for configuration class and it build bean factors to manage them
// so when a class is dependent on another config class method spring inject it automatically.

//-> @EnableAutoConfiguration -> (detects what jars are present.detect jars enable features.)when the app starts it call the class AutoConfigurationImportSelector.class
// it acts like select and load means go through the jar files(dependencies) like server , dispatcherservlet , jackson , hibernate , mvcconfiguration , etc.
// so it loads the class through the conditional annotation means it will load the dependencies based on the conditions if its true it loads or not .
// for eg: webmvcconfiguration inside this class spring does -> dispacther servlet , internalresource viewer , requesthandeler .
// working flow -> autoconfigurationimportselector class - read all autoconfiguration.imports file - collect list of auto-config class - apply conditional annotation - load if pass - register beans from that class.

//-> @ComponentScan -> ClassPathBeanDefinitionScanner.class -> loads every packages and search for classes anno with @component and create
// convert them into beandefinitions and register them in application context(ioc) and spring initiaes them during context.refresh();
// and also look for streotype annotations (compo,service,repo,controller,restcontroller,configuration)
//}
public class AiProjectAmazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiProjectAmazonApplication.class, args);
	}

}
