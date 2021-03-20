package com.galvanize.gmoviedatabase;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class GMovieDatabaseServiceTest {
    @Mock
    GMovieDatabaseRepository gMovieDatabaseRepository;

    @InjectMocks
    GMovieDatabaseService gMovieDatabaseService;

    @Test
    public void create(){
        MovieDTO movieDTO=new MovieDTO("The Avengers");
        this.gMovieDatabaseService.create(movieDTO);
        Mockito.verify(this.gMovieDatabaseRepository).save(
                new MovieDTO("The Avengers")
        );
    }

    @Test
    public void fetch(){
        MovieDTO movieDTO=new MovieDTO("The Avengers");
        Mockito.when(this.gMovieDatabaseRepository.findAll()).thenReturn(
                List.of(
                        movieDTO,
                        new MovieDTO("Superman Returns")
                )
        );

        List<MovieDTO> actual=this.gMovieDatabaseService.fetchAll();

        Assertions.assertThat(actual).isEqualTo(
                List.of(
                        new MovieDTO("The Avengers"),
                        new MovieDTO("Superman Returns")
                )
        );
    }
}
