package org.jason.sc.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer01 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer01.class, args);
    }
}
