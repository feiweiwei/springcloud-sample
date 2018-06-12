package com.monkey01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 15:07 18/6/11.
 * @modify by:
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
}
