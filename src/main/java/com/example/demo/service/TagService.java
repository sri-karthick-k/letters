package com.example.demo.service;

import com.example.demo.Tag;
import com.example.demo.repo.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    public Optional<Tag> getTagById(String id) {
        return tagRepository.findById(id);
    }

    public Tag saveTag(Tag tag) {
        return tagRepository.save(tag);
    }

    public void deleteTag(String id) {
        tagRepository.deleteById(id);
    }
}
