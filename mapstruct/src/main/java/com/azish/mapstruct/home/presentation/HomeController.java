package com.azish.mapstruct.home.presentation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eng.motahari@gmail.com<br>
 * کلاس کنترلر خانه
 */
@RestController
public class HomeController {

    @Value("${spring.application.name}")
    private String springApplicationName;

    @GetMapping("/")
    public String home() {
        return springApplicationName;
    }

}
