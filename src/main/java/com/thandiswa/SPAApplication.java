package com.thandiswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SPAApplication {

    public static void main(String[] args){

        SpringApplication.run(SPAApplication.class, args);
    }
}
