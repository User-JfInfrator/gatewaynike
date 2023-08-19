package br.com.tech4me.gatewaynike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewaynikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaynikeApplication.class, args);
	}

}
