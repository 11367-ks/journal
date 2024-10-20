package com.web.journal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Getter
@Data
@Entity
@Table(name = "Meetings")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MeetingModel extends EntryModel{
    @Builder(builderMethodName = "meetingBuilder")
    public MeetingModel(String description, LocalDate date) {
        super(description, date);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public LocalDate getDate() {
        return super.getDate();
    }
}
