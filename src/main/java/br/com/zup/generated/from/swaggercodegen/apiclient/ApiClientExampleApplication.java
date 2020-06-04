package br.com.zup.generated.from.swaggercodegen.apiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiClientExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiClientExampleApplication.class, args);
	}

}
