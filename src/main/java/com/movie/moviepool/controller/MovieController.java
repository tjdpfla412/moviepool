package com.movie.moviepool.controller;

import com.movie.moviepool.service.MovieService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@AllArgsConstructor
@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;


    @GetMapping("/test")
    public ResponseEntity<?> getTest() throws Exception {
        System.out.println("컨트롤러 테스트");
        return ResponseEntity.ok(movieService.getTest());
    }

    @GetMapping("/api/hello")
    public ResponseEntity<?> test() throws Exception {
        return ResponseEntity.ok(movieService.getTest());
    }

}
