package se.dunemark.rabbitvalidation;


import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.RabbitMQContainer;

@TestConfiguration(proxyBeanMethods = false)
public class TestContainerConfig {

    @Bean
    @ServiceConnection
    public RabbitMQContainer rabbitMQContainer(){
        return new RabbitMQContainer("rabbitmq:3.11.16");
    }
}
