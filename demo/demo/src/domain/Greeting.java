package com.example.demo.domain;

public record Greeting(long id, String content) { 

@GetMapping("/greeting/{name}")
public Greeting greetingPath(@PathVariable String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
}
}