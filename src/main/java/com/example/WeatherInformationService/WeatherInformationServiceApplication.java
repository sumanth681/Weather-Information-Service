package com.example.WeatherInformationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WeatherInformationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherInformationServiceApplication.class, args);
    }
}
