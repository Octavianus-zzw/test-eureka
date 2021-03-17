package com.zzwmservicetest.testeureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaZone;

    @GetMapping(value = "/get_config")
    public String getConfig() {
        return this.port + this.eurekaZone;
    }
}
