package com.zzwmservicetest.testeureka;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableApolloConfig
public class TestEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestEurekaApplication.class, args);
    }

}
