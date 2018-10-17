package com.daryoush.joobbani.maketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses= {MarketplaceApiApplication.class,Jsr310Converters.class})
public class MarketplaceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceApiApplication.class, args);
	}
}
