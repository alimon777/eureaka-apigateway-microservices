package com.ust.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringGatewayConfiguration {
	@Bean
	RouteLocator gatewayRoute(RouteLocatorBuilder builder) {
		return 
			builder
			.routes()
			.route("helloservice", r->r.path("/rest/service1/**")
				.filters(f->f.addResponseHeader("X-Response-Header","World")) //shows the it in the response header
				.uri("http://localhost:8071"))
			.route("factorialservice", r->r.path("/rest/service2/**")
				.uri("http://localhost:8072"))
			.build();
	}

}
