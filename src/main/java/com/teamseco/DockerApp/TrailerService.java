package com.teamseco.DockerApp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrailerService {
    private List<Trailer> trailerList = new ArrayList<>();

    public void addTrailer(){
        Trailer trailer = new Trailer();
        trailer.setId(1);
        trailer.setTrailerNumber(111);
        trailer.setTrailerCompany("Example Trailer Company");
        trailerList.add(trailer);

        Trailer trailer2 = new Trailer();
        trailer2.setId(1);
        trailer2.setTrailerNumber(222);
        trailer2.setTrailerCompany("Second Example Trailer Company");
        trailerList.add(trailer2);
    }
    public List<Trailer> getTrailers(){
        return trailerList;
    }
}
