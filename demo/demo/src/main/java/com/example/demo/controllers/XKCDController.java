package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class XKCDController {
@RequestMapping
    @GetMapping("/xkcd")
    public XkcdComic xkcdComic(){
        System.out.println("Hello and Welcome to NASA Astronomy Picture of the Day");
        RestTemplate restTemplate = new RestTemplate();
        XkcdComic result = restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=RzyFxHkZBTcmrc4kefhp7pgaF0PCCmxggWzjA76P", XkcdComic.class);
        return result;
    }

    @GetMapping("/xkcd/{comicNumber}")
    public XkcdComic xkcdComicPast(@PathVariable String comicNumber){
        RestTemplate restTemplate = new RestTemplate();
        XkcdComic result = restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=RzyFxHkZBTcmrc4kefhp7pgaF0PCCmxggWzjA76P" + comicNumber + "/info.0.json", XkcdComic.class);
        return result;
    }
}