package com.galvanize.gmoviedatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GMovieDatabaseService {
    private final GMovieDatabaseRepository gMovieDatabaseRepository;

    @Autowired
    public GMovieDatabaseService(GMovieDatabaseRepository gMovieDatabaseRepository) {
        this.gMovieDatabaseRepository = gMovieDatabaseRepository;
    }

    public List<MovieDTO> fetchAll() {
        return null;
    }

    public void create(MovieDTO movieDTO) {
    }
}
