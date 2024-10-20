package com.web.journal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Getter
@Data
@Entity
@Table(name = "Lessons")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class LessonModel extends EntryModel {
    private int teacher_id, class_id, duration;
    @Builder(builderMethodName = "lessonBuilder")
    public LessonModel(String description, LocalDate date, int teacher_id, int class_id, int duration) {
        super(description, date);
        this.teacher_id = teacher_id;
        this.class_id = class_id;
        this.duration = duration;
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
