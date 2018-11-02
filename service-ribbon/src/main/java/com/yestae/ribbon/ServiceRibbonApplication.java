package com.yestae.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * spring cloud 消费者
 * @author wangpeng
 *
 */
@SpringBootApplication
@EnableDiscoveryClient	//服务消费端
public class ServiceRibbonApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}

	/**
	 * 发送请求的模板类
	 * @return
	 */
	@Bean
	@LoadBalanced //负载均衡
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
