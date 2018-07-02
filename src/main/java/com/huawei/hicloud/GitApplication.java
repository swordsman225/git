package com.huawei.hicloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * commit test 10001
 * @author dell
 *
 */
@SpringBootApplication
public class GitApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(GitApplication.class);

	public static void main(String[] args) {
		logger.info("### GitApplication ...");
		SpringApplication.run(GitApplication.class, args);
	}

}
