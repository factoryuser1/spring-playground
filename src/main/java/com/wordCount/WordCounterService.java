package com.wordCount;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//this is a Service class
@Service
public class WordCounterService {

    public Map<String, Integer> count(String message){
        Map<String, Integer> counts = new HashMap<>();
        String[] words = message.split(" ");

        for (String word: words){
            counts.put(word, counts.get(word)+1);
        }
        return counts;
    }
}
