package se.dunemark.rabbitvalidation;


import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PayloadController {

    private final RabbitTemplate template;

    @PostMapping("/failed")
    public void failValidationPayload(){
        template.convertAndSend(new SampleData(55, "Yeea"));
    }

    @PostMapping("/pass")
    public void passValidationPayload(){
        template.convertAndSend(new SampleData(1, "Yeea"));
    }
}
