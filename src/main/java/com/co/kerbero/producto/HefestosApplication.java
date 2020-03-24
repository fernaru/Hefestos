package com.co.kerbero.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EntityScan({"com.co.kerbero.models.entity"})
public class HefestosApplication {

	public static void main(String[] args) {
		SpringApplication.run(HefestosApplication.class, args);
	}

}
