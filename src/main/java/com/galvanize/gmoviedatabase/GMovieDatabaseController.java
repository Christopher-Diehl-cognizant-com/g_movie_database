package com.galvanize.gmoviedatabase;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class GMovieDatabaseController {
    List<Movie> movies = new ArrayList<>();

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> getMovies(){
        return this.movies;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void postMovies(@RequestBody Movie movie){
        this.movies.add(movie);
    }

}
