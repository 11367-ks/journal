package com.web.journal.repositories;

import com.web.journal.models.GradeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<GradeModel, Long> { }
