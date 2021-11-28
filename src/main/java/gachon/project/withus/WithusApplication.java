package gachon.project.withus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class WithusApplication {

	public static void main(String[] args) {
		SpringApplication.run(WithusApplication.class, args);
	}

}
