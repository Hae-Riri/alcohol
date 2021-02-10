package kr.co.theplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InternalApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InternalApiApplication.class, args);
    }
}
