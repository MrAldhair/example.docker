package com.programmers.docker.test.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/inicio")
    public String inicio(){
        return "Hola desde Docker";
    }
}
