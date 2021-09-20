package com.wordCount;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WordCounterController {
    private final WordCounterService wordCounterService = new WordCounterService();

//    private final WordCounterService wordCounterService;
//    public WordCounterController(WordCounterService wordCounterService) {
//        this.wordCounterService = wordCounterService;
//    }

    @PostMapping("/words/count")
    public Map<String, Integer> getJson(@RequestBody String message){
        return wordCounterService.count(message);
    }
}
