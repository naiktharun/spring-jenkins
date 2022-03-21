package dk.danskebank.jenkin.api;



import javax.annotation.PostConstruct;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringJenkinsApplication {

	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		
		logger.info("Application started...");
		
		
	}
	
	
	
	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
