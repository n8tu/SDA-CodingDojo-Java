package com.example.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloHumanApplication.class, args);
    }

    @RequestMapping("/")
    public String index(@RequestParam(value = "name",required = false) String name,
                        @RequestParam(value = "last_name",required = false) String last_name,
                        @RequestParam(value = "times", required = true) int times){
        String text = "";
        for(int i = 0; i < times; i++){
            if(name == null){
                text += "Hello Human ";
            }else{
                if(last_name != null){
                    name += " " + last_name;
                }
                text += "Hello " + name + " ";
            }
        }

        return text;
    }

}
