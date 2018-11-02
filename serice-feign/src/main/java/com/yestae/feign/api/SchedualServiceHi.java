package com.yestae.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *	Feign 方式进行服务端调用
 * @author wangpeng
 *
 */
@FeignClient(value = "service-hi")	//指定调用哪个服务
public interface SchedualServiceHi {
	//调用哪个服务接口
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
