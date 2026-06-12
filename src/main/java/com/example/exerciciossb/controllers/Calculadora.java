package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class Calculadora {

    @GetMapping(path = "/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
        return a + b;
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return a - b;
    }
}
