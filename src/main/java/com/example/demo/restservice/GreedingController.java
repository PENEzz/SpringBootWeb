package com.example.demo.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreedingController {
	@GetMapping("/hello")
    public String getMethodName(@RequestParam(value = "name", defaultValue = "World") String name) {
      return sayHello(name);
    }
    public String sayHello(String name){
      return "Hello " + name;
    }
}