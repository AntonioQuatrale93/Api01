package it.develhope.Api01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    String name = "Antonio";
    StringBuilder reversed = new StringBuilder(name).reverse();


    @GetMapping("/name")
    public String replyWithName() {
        return "My name is " + name;
    }

    @PostMapping("/name")
    public String reversedName() {
        return "My name is " + reversed;
    }
}
