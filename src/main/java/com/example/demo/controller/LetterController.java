package com.example.demo.controller;

import com.example.demo.Letter;
import com.example.demo.service.LetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/letters")
public class LetterController {

    @Autowired
    private LetterService letterService;

    @GetMapping
    public List<Letter> getAllLetters() {
        return letterService.getAllLetters();
    }

    @GetMapping("/{id}")
    public Optional<Letter> getLetterById(@PathVariable String id) {
        return letterService.getLetterById(id);
    }

    @PostMapping
    public Letter createLetter(@RequestBody Letter letter) {
        return letterService.saveLetter(letter);
    }

    @DeleteMapping("/{id}")
    public void deleteLetter(@PathVariable String id) {
        letterService.deleteLetter(id);
    }
}
