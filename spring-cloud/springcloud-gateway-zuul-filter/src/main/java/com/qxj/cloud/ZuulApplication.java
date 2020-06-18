package com.qxj.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.qxj.cloud.filter.PreZuulFilter;

@SpringBootApplication
//zuul代理注解
@EnableZuulProxy
public class ZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
	
	/**
	 * 将过滤器交给Spring管理
	 * @return
	 */
	@Bean
	public PreZuulFilter preZuulFilter() {
		return new PreZuulFilter();
	}
}
