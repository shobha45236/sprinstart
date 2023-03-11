package edu.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(@SpringBootConfiguration+@EnableAutoConfiguration+@ComponentScan=@SpringBootApplication)
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class SpringstartApplication {

	public static void main(String[] args) {
		System.out.println("the thread is " + Thread.currentThread().getName());
		SpringApplication.run(SpringstartApplication.class, args);
	}

}
