package it.esc2.earlyWarning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class EarlyWarningApplication {

    public static void main(String[] args) {
        SpringApplication.run(EarlyWarningApplication.class, args);
    }
}
