package com.web.journal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Getter
@Data
@Entity
@Table(name = "Assignments")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class AssignmentModel extends EntryModel{
    private int student_id, teacher_id;
    private String type;
    @Builder(builderMethodName = "assignmentBuilder")

    public AssignmentModel(String description, LocalDate date, int student_id, int teacher_id, String type) {
        super(description, date);
        this.student_id = student_id;
        this.teacher_id = teacher_id;
        this.type = type;
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
