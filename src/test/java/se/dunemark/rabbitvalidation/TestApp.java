package se.dunemark.rabbitvalidation;

import org.springframework.boot.SpringApplication;

public class TestApp {

    public static void main(String[] args) {
        SpringApplication.from(RabbitValidationApplication::main)
                .with(TestContainerConfig.class)
                .run(args);
    }

}
