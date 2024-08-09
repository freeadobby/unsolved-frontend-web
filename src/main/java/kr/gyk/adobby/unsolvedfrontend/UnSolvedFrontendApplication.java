package kr.gyk.adobby.unsolvedfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class UnSolvedFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnSolvedFrontendApplication.class, args);
	}

}
