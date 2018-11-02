package org.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring clound 注册中心
 * @author wangpeng
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication{
	public static void main(String[] args) {
        SpringApplication.run( EurekaServerApplication.class );
    }
}
