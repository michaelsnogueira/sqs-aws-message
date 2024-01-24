package br.com.nogueira.sqsawsmessage;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqsAwsMessageApplication implements CommandLineRunner {

    @Autowired
    private SqsTemplate sqsTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SqsAwsMessageApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var url = "https://localhost.localstack.cloud:4566/000000000000/my-first-queue";

        sqsTemplate.send(url, new Message("Hello World"));


    }
}
