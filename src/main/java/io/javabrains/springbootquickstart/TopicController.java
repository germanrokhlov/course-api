package io.javabrains.springbootquickstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List <Topic> getAllTopics(){
        return Arrays.asList(

                new Topic("123","123","123"),
                new Topic("234","234", "234")

        );

    }


}
