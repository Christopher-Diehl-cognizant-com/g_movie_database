package com.galvanize.gmoviedatabase;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class GMovieDatabaseController {
    Movie movie;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> getMovies(){
        return Collections.emptyList();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void postMovies(@RequestBody Movie movie){
        this.movie = movie;
    }

}
