package com.blog.samples.boot.config;

import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/aws-config.xml")
@EnableRdsInstance(databaseName = "sipdb", 
                   dbInstanceIdentifier = "sipdb", 
				   password = "cashok08")
/**
 * 
 * @EnableRdsInstance(databaseName = "sipdb", 
                   dbInstanceIdentifier = "${db-instance-identifier:}", 
				   password = "${rdsPassword:}")
 * @author 1396263
 *
 */
public class AwsResourceConfig {

}