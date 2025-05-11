package com.IdeaXchange.model;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "thread_id")
    private ForumThread thread; // Correctly referencing your custom entity

    // Getters and Setters
}