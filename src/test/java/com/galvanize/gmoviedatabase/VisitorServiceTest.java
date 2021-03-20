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
public class VisitorServiceTest {
    @Mock
    VisitorRepository visitorRepository;

    @InjectMocks
    VisitorService visitorService;

    @Test
    public void create(){
        VisitorDTO visitorDTO=new VisitorDTO("Visitor1");
        this.visitorService.create(visitorDTO);
        Mockito.verify(this.visitorRepository).save(
                new VisitorDTO("Visitor1")
        );
    }

    @Test
    public void fetch(){
        VisitorDTO visitorDTO=new VisitorDTO("Visitor1");
        Mockito.when(this.visitorRepository.findAll()).thenReturn(
                List.of(
                        visitorDTO,
                        new VisitorDTO("Visitor1")
                )
        );

        List<VisitorDTO> actual=this.visitorService.fetchAll();

        Assertions.assertThat(actual).isEqualTo(
                List.of(
                        new VisitorDTO("Visitor1"),
                        new VisitorDTO("Visitor2")
                )
        );
    }

}
