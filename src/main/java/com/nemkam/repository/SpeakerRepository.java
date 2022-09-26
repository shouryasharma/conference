package com.nemkam.repository;

import java.util.List;

import com.nemkam.model.Speaker;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
