package com.gbb.spirngboot.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;

@Controller
@SpringBootApplication//Spring Boot项目的核心注解，主要目的是开启自动配置。
@Configuration//这是一个配置Spring的配置类；
public class HelloApplication {
		
		@RequestMapping("hello")
		@ResponseBody
		public String hello(){
			return "hello world！";
		}
		
		public static void main(String[] args) {//这个应用的入口
			SpringApplication.run(HelloApplication.class, args);
		}
		
	
/*	public static void main(String[] args) {//这个应用的入口
		SpringApplication springApplication = new SpringApplication(HelloApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}*/
	/*Spring Boot的项目一般都会有*Application的入口类，入口类中会有main方法，这是一个标准的Java应用程序的入口方法。
	@SpringBootApplication注解是Spring Boot的核心注解，它其实是一个组合注解：
	可以点进去看一下
	*/
		
	}
	
