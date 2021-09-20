package com.spring.playground;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@SpringBootConfiguration
public class WordCounterConfig {

    @Bean
    public WordCounterService getWordCounterConfig() {
        return new WordCounterService();
    }
}
