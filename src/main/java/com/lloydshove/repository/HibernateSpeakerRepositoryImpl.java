package com.lloydshove.repository;

import com.lloydshove.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
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
