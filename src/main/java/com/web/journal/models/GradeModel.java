package com.web.journal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Getter
@Data
@Entity
@Table(name = "Grades")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class GradeModel extends EntryModel{
    private int student_id, teacher_id, value;
    @Builder(builderMethodName = "gradeBuilder")
    public GradeModel(String description, LocalDate date, int student_id, int teacher_id, int value) {
        super(description, date);
        this.student_id = student_id;
        this.teacher_id = teacher_id;
        this.value = value;
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
