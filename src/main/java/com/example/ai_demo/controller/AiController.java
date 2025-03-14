package com.example.ai_demo.controller;


import com.example.ai_demo.util.AiUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class AiController {

    @RequestMapping(value = "/img", method = RequestMethod.POST)
    public String img(@RequestParam("file") MultipartFile file) throws IOException {
        return AiUtils.img(file);

    }

    @RequestMapping(value = "/word", method = RequestMethod.POST)
    public String word(@RequestParam("file") MultipartFile file) throws IOException {
        return AiUtils.word(file);

    }

    //TODO 目前用不了
    @RequestMapping(value = "/nlp", method = RequestMethod.GET)
    public String nlp(@RequestParam("text") String text) {
        return AiUtils.nlp(text);
    }
}
