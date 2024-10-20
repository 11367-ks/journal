package com.web.journal.repositories;

import com.web.journal.models.LessonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<LessonModel, Long> { }