package com.lyun55.learn_spring_aop.aopexample.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.lyun55.learn_spring_aop.aopexample.annotations.TrackTime;
import com.lyun55.learn_spring_aop.aopexample.data.DataService2;

@Service
public class BusinessSevice2 {
	
	private DataService2 dataSercvice2;
	
	public BusinessSevice2(DataService2 dataSercvice2) {
		this.dataSercvice2 = dataSercvice2;
	}
	
	@TrackTime
	public int calaculateMin() {
		int[] data = dataSercvice2.retrieveData();
		
		//throw new RuntimeException("Somthing Went Wrong!");
		return Arrays.stream(data).min().orElse(0);
	}

}
