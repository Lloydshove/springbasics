package com.lloydshove.com.lloydshove.service;

import com.lloydshove.model.Speaker;
import com.lloydshove.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService{

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("Speaker Service Impl no args constr");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        this.repository = speakerRepository;
        System.out.println("Speaker Service Impl repo constructor");
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    //@Autowired
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;

        System.out.println("setRepository");
    }
}
