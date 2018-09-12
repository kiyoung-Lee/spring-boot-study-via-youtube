package com.example.demo.youtube.day17;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VideoConverter implements Converter<String, Video> {

    @Override
    public Video convert(String id) {
        Video video = new Video();
        video.setId(Integer.parseInt(id));
        return video;
    }
}
