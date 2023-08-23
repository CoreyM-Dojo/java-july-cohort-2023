package com.example.springsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringsecurityApplicationTests {

	@Value("${HELLO}")
	String hello;

	@Test
	void contextLoads() {
		System.out.println(hello);
	}

}
