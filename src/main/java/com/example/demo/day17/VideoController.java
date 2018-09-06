package com.example.demo.day17;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class VideoController {

    @GetMapping("/video/{id}")
    public Video getVideo(@PathVariable Integer id){
        Video video = new Video();
        video.setId(id);
        return video;
    }

    // id 필드가 생략됨.
//    @GetMapping("/video/{id}")
//    public Video getVideo(@PathVariable("id") Integer id){
//        Video video = new Video();
//        video.setId(id);
//        return video;
//    }

    @GetMapping("/video/error/{id}")
    public Video getVideo(@PathVariable("id") Video video){
        return video;
    }

    @GetMapping("/video/exception")
    public Video getExceptionVideo(){
        throw new VideoException();
    }

}
