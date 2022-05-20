package net.codejava.CodeJavaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CodeJavaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeJavaAppApplication.class, args);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "1234";
		String encodedPassword = encoder.encode(rawPassword);

		System.out.println(encodedPassword);

	}

}
