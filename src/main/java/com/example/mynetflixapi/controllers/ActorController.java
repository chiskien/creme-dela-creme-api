package com.example.mynetflixapi.controllers;

import com.example.mynetflixapi.models.Actor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActorController {

    @GetMapping("/actor")
    public ResponseEntity<List<Actor>> getActors() {
        return ResponseEntity.ok().body(null);
    }
}
