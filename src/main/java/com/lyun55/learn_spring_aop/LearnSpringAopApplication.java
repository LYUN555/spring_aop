package com.lyun55.learn_spring_aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lyun55.learn_spring_aop.aopexample.business.BusinessSevice1;
import com.lyun55.learn_spring_aop.aopexample.business.BusinessSevice2;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private BusinessSevice1 businessSevice1;
	private BusinessSevice2 businessSevice2;
	
	public LearnSpringAopApplication(BusinessSevice1 businessSevice1, BusinessSevice2 businessSevice2) {
		this.businessSevice1 = businessSevice1;
		this.businessSevice2 = businessSevice2;
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("businessSevice1 Value returned is {}", businessSevice1.calaculateMax());
		logger.info("businessSevice2 Value returned is {}", businessSevice2.calaculateMin());
		
	}

}
