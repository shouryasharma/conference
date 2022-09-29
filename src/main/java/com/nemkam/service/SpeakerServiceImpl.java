package com.nemkam.service;

import java.util.List;

import com.nemkam.model.Speaker;
import com.nemkam.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
