package com.example.demo.Controller;

import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public List<String> getUsers(@PageableDefault Pageable pageable) {
        return Arrays.asList("Mazda", "Ford", "Volvo");
    }

}
