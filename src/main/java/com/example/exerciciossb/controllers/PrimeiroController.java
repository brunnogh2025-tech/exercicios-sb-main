package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeiroController {

    @GetMapping(path = {"/ola","/saudacao"})
    public String ola(){

        return "Olá Spring Boot!";
    }
    @PostMapping(path = {"/saudacao"})
    public String saudacao(){

        return "Olá Spring Boot (POST)!";
    }
}
