package com.estrus.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_estrus",
                r -> r.path("/**")
                        .uri("http://news.baidu.com")).build();
        routes.route("payment_routh",r -> r.path("/payment/get/**").uri("lb://cloud-payment-service")).build();

        return routes.build();
    }
}
