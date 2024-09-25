package org.example.servicediscovery_july2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryJuly2024Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryJuly2024Application.class, args);
    }

}
