package com.teamseco.DockerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private TrailerService trailerService;
    @GetMapping("/get")
    List<Trailer> getTrailers(){
        return trailerService.getTrailers();
    }

    @GetMapping("/add")
    String createTrailer(){
        trailerService.addTrailer();
        return "Trailers Added!";
    }
}
