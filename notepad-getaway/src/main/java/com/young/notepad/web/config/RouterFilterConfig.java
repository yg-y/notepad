package com.young.notepad.web.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Mono;

@Configuration
public class RouterFilterConfig {

    /**
     * 网关经常需要对路由请求进行过滤，对符合条件的请求进行一些操作，例如：增加请求头、增加请求参数、增加响应头和断路器等功能。
     * <p>
     * 当请求路径为 /test/custom 时，网关将请求转发到 http://ww.baidu.com;
     * <p>
     * 当请求路径为 /user 时，网关将请求转发到用户服务的/user 接口 ，/user-service/user
     *
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes().route(r -> r.path("/test/custom").uri("http://www.baidu.com"))
                .route(r -> r.path("/api2/**").uri("lb://notepad-auth-api"))
                .build();

    }

    /**
     * ip限流
     *
     * @return
     */
    @Bean
    public KeyResolver ipKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }

    /**
     * 接口限流
     *
     * @return
     */
    @Primary
    @Bean
    public KeyResolver apiKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getPath().value());
    }

    /**
     * 用户限流 此方式访问接口需携带 getFirst("xxxx) 中定义的xxxx
     * 此处为 userId
     *
     * @return
     */
    @Bean
    public KeyResolver userKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
    }
}
