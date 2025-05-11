package com.IdeaXchange.controller;

import com.IdeaXchange.model.ForumThread;
import com.IdeaXchange.repository.ThreadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/threads")
public class ThreadController {

    @Autowired
    private ThreadRepository threadRepository;

    @GetMapping
    public List<ForumThread> getAllThreads() {
        return threadRepository.findAll();
    }

    @PostMapping
    public ForumThread createThread(@RequestBody ForumThread thread) {
        return threadRepository.save(thread);
    }
}