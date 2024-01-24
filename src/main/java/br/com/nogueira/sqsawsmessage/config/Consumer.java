package br.com.nogueira.sqsawsmessage.config;

import br.com.nogueira.sqsawsmessage.Message;
import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @SqsListener("my-first-queue")
    public void receiveMessage(Message message){
        System.out.println("teste: " + message.content());
    }
}
