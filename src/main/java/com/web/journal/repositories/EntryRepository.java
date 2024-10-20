package com.web.journal.repositories;

import com.web.journal.models.EntryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<EntryModel, Long> { }