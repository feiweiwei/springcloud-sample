package com.monkey01.hystrixmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: feiweiwei
 * @Description:
 * @Created Date: 15:39 17/9/21.
 * @Modify by:
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
