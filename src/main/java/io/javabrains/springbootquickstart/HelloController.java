package io.javabrains.springbootquickstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
     public String sayhi(){

        return "Hi";
}

    @RequestMapping("/hello2")
    public String sayhi2(){

        return "Kiss my ass";
    }

}
