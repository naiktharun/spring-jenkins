package dk.danskebank.jenkin.api;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.*;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJenkinsApplicationTests {
	
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);


	@Test
	void contextLoads() {
		
		logger.info("Test Case executing..");
		assertEquals(true, true);
	//test

		
	}



}
