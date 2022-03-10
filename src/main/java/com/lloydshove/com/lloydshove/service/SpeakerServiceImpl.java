package com.lloydshove.com.lloydshove.service;

import com.lloydshove.model.Speaker;
import com.lloydshove.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService{

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        this.repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
