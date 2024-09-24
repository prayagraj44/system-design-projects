package com.checkwithprayag.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UrlShortnerContoller {

    @GetMapping("short-url")
    public ResponseEntity<String> getShortURL(@RequestParam String longURL){

        return ResponseEntity.ok("short url");
    }

}
