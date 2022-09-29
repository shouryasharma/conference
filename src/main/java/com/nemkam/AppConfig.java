package com.nemkam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nemkam.repository.HibernateSpeakerRepositoryImpl;
import com.nemkam.repository.SpeakerRepository;
import com.nemkam.service.SpeakerService;
import com.nemkam.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
