package se.dunemark.rabbitvalidation;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Service
@Validated
public class ValidationQueueListener {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("demo-queue"),
            exchange = @Exchange("demo")
    ))
    public void handle(@Payload @Valid SampleData data) {
        log.info("got payload {}", data);
    }
}
