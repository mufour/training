package org.acme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class SpringRessource {
    
    @GetMapping("/hello")
    public String springHello(){
        return "Hello from Spring in Fall";
    }
}
