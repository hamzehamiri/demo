package com.example.demo.Controllers;

import com.example.demo.entities.Personal;
import com.example.demo.repository.PersonalRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    private final PersonalRepository personalRepository;

    public PersonalController(PersonalRepository personalRepository) {
        this.personalRepository = personalRepository;
    }

    @PostMapping("/person")
    public String createPerson(@RequestParam String name) {
        personalRepository.save(new Personal(name, "10"));
        return personalRepository.findByName(name);
    }
}
