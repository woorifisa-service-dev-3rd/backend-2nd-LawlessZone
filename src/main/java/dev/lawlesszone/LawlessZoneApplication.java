package dev.lawlesszone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LawlessZoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(LawlessZoneApplication.class, args);
    }

}
