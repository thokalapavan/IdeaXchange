package com.IdeaXchange.repository;

import com.IdeaXchange.model.ForumThread;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThreadRepository extends JpaRepository<ForumThread, Long> {
}