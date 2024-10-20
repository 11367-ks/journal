package com.web.journal.repositories;

import com.web.journal.models.MeetingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepository extends JpaRepository<MeetingModel, Long> { }
