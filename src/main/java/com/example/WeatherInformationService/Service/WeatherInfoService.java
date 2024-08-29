package com.example.WeatherInformationService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.WeatherInformationService.Service.WeatherInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class WeatherInfoService {


    private final String Url  = "http://api.weatherstack.com/current?access_key=7877e7530d46181f85b38a11940c502f&query=";

    public  String getWeatherInfo(String city){

        try {
            String url = Url + city;

            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(url, String.class);

            return response;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "City not found or API Error", e);
        }


        }
    }

