package com.valtech.training.springbootassignnment.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.training.springbootassignnment.component.HelloWorld;



@SpringBootTest
class SpringBootAssignmentApplicationTests {
	
	@Autowired
	private HelloWorld helloWorld;
	
	
	
	
	@Test
	void contextLoads() {
		assertNotNull(helloWorld);
		
	}

}
