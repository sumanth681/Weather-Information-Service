package com.example.WeatherInformationService.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.WeatherInformationService.Service.WeatherInfoService;
import java.util.*;



@RestController
@RequestMapping("/weather")
public class WeatherInfoController {

    @Autowired
    WeatherInfoService weatherInfoService;

    @GetMapping("/{city}")
    public String getWeatherReport(@PathVariable("city") String city){

        return weatherInfoService.getWeatherInfo(city);
    }

    // http://api.weatherstack.com/current?access_key=7877e7530d46181f85b38a11940c502f&query=
}