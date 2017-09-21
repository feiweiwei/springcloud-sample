package com.monkey01.hystrixmq.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: feiweiwei
 * @Description:
 * @Created Date: 11:00 17/9/21.
 * @Modify by:
 */
@RestController
public class TestController {
	@HystrixCommand(fallbackMethod = "error", commandProperties = {
			@HystrixProperty(name="execution.isolation.strategy", value = "THREAD"),
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "4000"),
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "40")
	}, threadPoolProperties = {
			@HystrixProperty(name = "coreSize", value = "1"),
//			@HystrixProperty(name = "maximumSize", value = "5"),
			@HystrixProperty(name = "maxQueueSize", value = "10"),
			@HystrixProperty(name = "keepAliveTimeMinutes", value = "1000"),
			@HystrixProperty(name = "queueSizeRejectionThreshold", value = "8"),
			@HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "12"),
			@HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "1440")
	})
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
	public String hello(){
		return "hello hystrix!";
	}

	public String error() {
		return "hello error!";
	}

}
