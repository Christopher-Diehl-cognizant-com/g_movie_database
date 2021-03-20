package com.galvanize.gmoviedatabase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class GMovieDatabaseController {
    @GetMapping()
    public List<Movie> getMovies(){
        return Collections.emptyList();
    }
}
