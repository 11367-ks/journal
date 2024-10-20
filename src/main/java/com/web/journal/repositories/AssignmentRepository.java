package com.web.journal.repositories;

import com.web.journal.models.AssignmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<AssignmentModel, Long> { }
