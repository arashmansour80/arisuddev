package it.esc2.earlyWarning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class EarlyWarningApplication {

    public static void main(String[] args) {
        SpringApplication.run(EarlyWarningApplication.class, args);
    }
}
