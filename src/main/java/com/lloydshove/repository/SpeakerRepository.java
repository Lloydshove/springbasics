package com.lloydshove.repository;

import com.lloydshove.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
