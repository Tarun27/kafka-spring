package com.tarun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(KafkaProperties.class)
public class KafkaSpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringbootDemoApplication.class, args);
    }
}
