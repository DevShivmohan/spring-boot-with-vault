package com.vault.example;

import com.vault.example.model.Credential;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
public class VaultDemoApplication {
	/**
	 * after dependency injection completed will assigned a object with data from vault server
	 */
	@Autowired
	private Credential credential;

	public static void main(String[] args) {
		SpringApplication.run(VaultDemoApplication.class, args);
	}

	@PostConstruct
	public void testCredentialFromVault(){
		System.out.println(credential);
	}

}
