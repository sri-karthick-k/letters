package com.example.demo.service;

import com.example.demo.Letter;
import com.example.demo.repo.LetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LetterService {

    @Autowired
    private LetterRepository letterRepository;

    public List<Letter> getAllLetters() {
        return letterRepository.findAll();
    }

    public Optional<Letter> getLetterById(String id) {
        return letterRepository.findById(id);
    }

    public Letter saveLetter(Letter letter) {
        return letterRepository.save(letter);
    }

    public void deleteLetter(String id) {
        letterRepository.deleteById(id);
    }
}
