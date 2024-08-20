package com.eh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AppEhcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEhcacheApplication.class, args);
	}

}
