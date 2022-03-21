package dk.danskebank.jenkin.api;


import org.junit.jupiter.api.Test;

import org.slf4j.*;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJenkinsApplicationTests {
	
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	private final Integer ACTUAL = 9;
	private final Integer EXPECTED = 9;

	@Test
	void contextLoads() {
		
		logger.info("Test Case executing..");
	

		
	}



}
