package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class XkcdComic {
    private String date;
    private String explanation;
    private String start_date;
    private String end_date;
    private int count;
    private int thumbs;
    private String api_key;  
}
