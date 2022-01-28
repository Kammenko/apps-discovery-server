package com.kammenko.appsdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppsDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppsDiscoveryServerApplication.class, args);
    }

}
