package com.nemkam.repository;

import java.util.ArrayList;
import java.util.List;

import com.nemkam.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Shourya");
        speaker.setLastName("Sharma");

        speakers.add(speaker);

        return speakers;
    }
}
