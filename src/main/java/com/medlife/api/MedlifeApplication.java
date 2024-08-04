package com.medlife.api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Abhay
 *
 */
@SpringBootApplication

public class MedlifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedlifeApplication.class, args);
		System.out.println("App started");
	}
	

}
