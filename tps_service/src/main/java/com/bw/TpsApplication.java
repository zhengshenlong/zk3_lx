package com.bw;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpsApplication.class,args);
    }
}
