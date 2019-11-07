package xyz.wangfan.gatwayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@EnableDiscoveryClient
@SpringBootApplication
public class GatwayServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(GatwayServiceApplication.class, args);

    }

//    @Bean
//    public RouterFunction<ServerResponse> testFunRouterFunction() {
//        RouterFunction<ServerResponse> route = RouterFunctions.route(
//                RequestPredicates.path("/test"), request -> ServerResponse.ok()
//                        .body(BodyInserters.fromObject("I am testing")));
//        return route;
//    }
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes().route(r -> r.path("/test/custom").uri("http://ww.baidu.com"))
//                .route(r -> r.path("/user/**").uri("lb://user-service"))
//                .build();
//    }

}
