package org.cwx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by weican on 2018/6/8.
 */
@EnableEurekaServer
@SpringBootApplication
public class RegitryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegitryApplication.class, args);
    }
}
