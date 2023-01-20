package com.example.rest_api;

import com.example.rest_api.API.Agify;
import com.example.rest_api.API.AgifyRepository;
import com.example.rest_api.API.CatFact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
@SpringBootApplication
@RestController

public class RestApiApplication {


    public static void main(String[] args) {

        SpringApplication.run(RestApiApplication.class, args);

        String url = "https://catfact.ninja/fact?max_length=100"; //https://catfact.ninja/
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

        String url1 = "https://api.agify.io/?name=ludek"; // https://agify.io/

        WebClient.Builder builder2 = WebClient.builder();

        Agify api = builder2.build()
                .get()
                .uri(url1)
                .retrieve()
                .bodyToMono(Agify.class)
                .block();

        System.out.println(api);
        System.out.println("----------------------");


        //agregovaný výstup?
        System.out.println(api + "| DRUHÝ VÝSTUP |" + catFact);

    }

}
