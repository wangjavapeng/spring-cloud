package com.yestae.hi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * spring cloud 服务提供者，将服务注册到注册中心
 * @author wangpeng
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceHiApplication {
 	public static void main(String[] args) {
        SpringApplication.run( ServiceHiApplication.class, args );
    }
}
