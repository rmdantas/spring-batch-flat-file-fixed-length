package com.dantas.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author rmdantas
 * @version 1.0
 * @versionDate 2021-06-09 13:40:37
 * @since 2021-06-09
 *
 */

@EnableBatchProcessing
@SpringBootApplication
public class SpringBatchFlatFileFixedLengthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchFlatFileFixedLengthApplication.class, args);
	}

}
