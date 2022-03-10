package com.lloydshove.repository;

import com.lloydshove.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Lloyd Robbie");
        speaker.setLastName("Shove");

        speakers.add(speaker);

        return speakers;
    }

}
