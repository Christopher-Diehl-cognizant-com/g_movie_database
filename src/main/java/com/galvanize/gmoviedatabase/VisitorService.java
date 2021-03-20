package com.galvanize.gmoviedatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {
    private final VisitorRepository visitorRepository;

    @Autowired

    public VisitorService(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    public List<VisitorDTO> fetchAll() {return null;}

    public void create(VisitorDTO visitorDTO){}
}
