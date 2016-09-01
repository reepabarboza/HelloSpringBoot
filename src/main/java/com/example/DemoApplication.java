package com.example;

import com.services.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/*@Configuration
@EnableAutoConfiguration*/
@ComponentScan({"com.services","com.example"})
@SpringBootApplication
public class DemoApplication {

	/*@Bean
	public User user() {
		return new User("Reepa", "Barboza");
	}*/

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		/*String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String name : beanNames) {
			System.out.println(name);
		}*/
 	}
}
