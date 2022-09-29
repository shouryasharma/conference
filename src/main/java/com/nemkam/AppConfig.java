package com.nemkam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nemkam.service.SpeakerService;
import com.nemkam.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl();
    }
}
