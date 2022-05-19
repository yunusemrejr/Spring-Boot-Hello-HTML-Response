package com.yunus.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloApplication {

    @RequestMapping("/hello")
    public String hello() {
        return "<html><body>"+
        
        "<h1>Welcome to Yunus's Demo HTML response</h1>"+
        "<br><hr><style>body{font-family:arial;size:20;}</style>"
        
        +"</body></html>";
    }

}
