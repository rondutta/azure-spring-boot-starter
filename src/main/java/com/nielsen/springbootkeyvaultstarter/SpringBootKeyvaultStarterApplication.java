package com.nielsen.springbootkeyvaultstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBootKeyvaultStarterApplication implements CommandLineRunner {

	@Value("${connectionString}")
	private String connectionString;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKeyvaultStarterApplication.class, args);
		GreeterClass greet = new GreeterClass();
		greet.printMessage("Key Vault Integration done with Spring Boot");
	}

	public void run(String... var1) throws Exception {
		System.out.println(String.format("\nConnection String stored in Azure Key Vault: \n%s\n",connectionString));
	}

}
