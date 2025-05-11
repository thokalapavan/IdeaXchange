package com.IdeaXchange.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.IdeaXchange.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
