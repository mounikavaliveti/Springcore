package com.Mounika;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:dbconfig.properties")
public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(Application.class);
		SpringService personDAO = run.getBean(SpringService.class);
		System.out.println(personDAO.toString());

		
	}

}
