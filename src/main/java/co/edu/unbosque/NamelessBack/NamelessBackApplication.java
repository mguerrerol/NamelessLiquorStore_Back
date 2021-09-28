package co.edu.unbosque.NamelessBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude =  {SecurityAutoConfiguration.class})
public class NamelessBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamelessBackApplication.class, args);
	}

}
