package com.web.journal.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Data
@MappedSuperclass
@NoArgsConstructor
public abstract class EntryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    protected int id;
    protected LocalDate date;
    protected String description;

    protected EntryModel(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }
}
