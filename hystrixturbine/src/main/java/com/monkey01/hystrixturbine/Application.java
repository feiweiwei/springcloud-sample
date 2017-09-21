package com.monkey01.hystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;


/**
 * @Author: feiweiwei
 * @Description:
 * @Created Date: 17:10 17/9/18.
 * @Modify by:
 */
@SpringBootApplication
@EnableTurbineStream
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
