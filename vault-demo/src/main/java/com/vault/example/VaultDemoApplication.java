package com.vault.example;

import com.vault.example.entity.User;
import com.vault.example.service.UserService;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class VaultDemoApplication {
	private final UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(VaultDemoApplication.class, args);
	}

	@PostConstruct
	public void test(){
		User user=new User();
		user.setUsername("Shiv");
		user.setPassword("Shiv");
		System.out.println(userService.addUser(user));
//		System.out.println(user);
	}

}
