package com.example.rest_api;

import com.example.rest_api.API.CatFact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(RestApiApplication.class, args);

        String url = "https://catfact.ninja/fact?max_length=100";
        WebClient.Builder builder = WebClient.builder();

        CatFact catFact = builder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(CatFact.class)
                .block();

        System.out.println("----------------------");
        System.out.println(catFact);
        System.out.println("----------------------");

    }
}
