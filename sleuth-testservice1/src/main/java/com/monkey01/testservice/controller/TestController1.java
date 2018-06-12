package com.monkey01.testservice.controller;

import com.netflix.discovery.DiscoveryClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:02 18/6/11.
 * @modify by:
 */
@RestController
public class TestController1 {
	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DiscoveryClient discoveryClient;


	@RequestMapping(value = "/testController1", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
	public String testController1(){
		List<String> list = discoveryClient.getDiscoveryServiceUrls("registry");
		for(String url : list){
			System.out.println(url + "===");
		}
		logger.info("===call testController1===");
		return restTemplate.getForEntity("http://SLEUTH-TESTSERVICE2/testController2", String.class).getBody();
	}

}
