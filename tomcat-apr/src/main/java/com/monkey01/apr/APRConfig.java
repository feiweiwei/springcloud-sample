package com.monkey01.apr;

import org.apache.catalina.LifecycleListener;
import org.apache.catalina.core.AprLifecycleListener;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class APRConfig {
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory container = new TomcatEmbeddedServletContainerFactory();
			LifecycleListener aprLifecycle = new AprLifecycleListener();
			container.setProtocol("org.apache.coyote.http11.Http11AprProtocol");
			container.addContextLifecycleListeners(aprLifecycle);

		return container;
	}
}
