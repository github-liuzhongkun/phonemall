package com.city.phonemall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PhonemallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhonemallGatewayApplication.class, args);
    }

}
