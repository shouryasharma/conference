package com.nemkam.service;

import java.util.List;

import com.nemkam.model.Speaker;
import com.nemkam.repository.HibernateSpeakerRepositoryImpl;
import com.nemkam.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
