package com.IdeaXchange.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class ForumThread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @OneToMany(mappedBy = "thread", cascade = CascadeType.ALL)
    private List<Comment> comments;

    // Getters and Setters
}