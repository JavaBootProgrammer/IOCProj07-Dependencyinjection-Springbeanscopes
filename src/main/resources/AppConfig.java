//AppConfig.java (Configuration class)
package com.nt.config;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nt.ston.Printer;

@Configuration
//@ComponentScan(basePackages = {"com.nt.sbeans","com.nt.ston"})
@ComponentScan(basePackages = "com.nt")
//@Lazy(true)
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	
	@Bean(name="ldt")
	//@Bean
	@Scope("prototype")
	public   LocalDateTime createLDT() {
		System.out.println("AppConfig.createLDT()");
		return  LocalDateTime.now();
	}

	@Bean(name="dt1")
	@Scope("prototype")
	public  Date  createDate() {
		System.out.println("AppConfig.createDate()");
		return  new Date();
	}
	
	@Bean(name="dt2")
	@Scope("singleton")
	public  Date createDate1() {
		return  new Date();
	}
	

	/*	@Bean(name="prn1")
		@Scope("singleton")
		public  Printer  createPrinter1() {
			return  Printer.getInstance();
		}*/
		
	/*	@Bean(name="prn")
		@Scope("prototype")
		public  Printer  createPrinter2() {
			return  Printer.getInstance();
		}
	*/
}
