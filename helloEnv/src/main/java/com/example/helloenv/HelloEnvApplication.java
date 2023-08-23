package com.example.helloenv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.paulschwarz.springdotenv.DotenvPropertySource;

@SpringBootApplication
public class HelloEnvApplication {

	 private static final Logger log = LoggerFactory.getLogger(HelloEnvApplication.class);


	  public static void main(String[] args) {
	    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

	    // Add DotenvPropertySource to environment before registering components
	    DotenvPropertySource.addToEnvironment(applicationContext.getEnvironment());

	    applicationContext.register(Config.class);
	    applicationContext.refresh();

	    Config config = applicationContext.getBean(Config.class);
	    log.info("Hello, {}", config.name);
	  }

}
