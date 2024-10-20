package com.web.journal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.web.journal.models.AssignmentModel;
import com.web.journal.services.EntryService;
import com.web.journal.models.MeetingModel;
import com.web.journal.models.LessonModel;
import com.web.journal.models.GradeModel;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.util.List;

@Controller
public class JournalController {

    @Autowired
    private EntryService entryService;

    @GetMapping("/")
    public String ShowDashboard() {
        return "dashboard";
    }

    @GetMapping("/schedule")
    public String ShowSchedule(Model model) {
        List<LessonModel> lessons = entryService.getAllLessons();
        model.addAttribute("lessons", lessons);
        return "schedule";
    }

    @GetMapping("/grades")
    public String ShowGrades(Model model){
        List<GradeModel> grades = entryService.getAllGrades();
        model.addAttribute("grades", grades);
        return "grades";
    }

    @GetMapping("/assignments")
    public String ShowAssignments(Model model){
        List<AssignmentModel> assignments = entryService.getAllAssignments();
        model.addAttribute("assignments", assignments);
        return "assignments";
    }

    @GetMapping("/meetings")
    public String ShowMeetings(Model model){
        List<MeetingModel> meetings = entryService.getAllMeetings();
        model.addAttribute("meetings", meetings);
        return "meetings";
    }

    @GetMapping("/lesson-planner")
    public String ShowLessonForm() {
        return "lesson-planner";
    }

    @PostMapping("/lesson-planner")
    public String SubmitLessonForm(
            @RequestParam String description,
            @RequestParam int teacher_id,
            @RequestParam int class_id,
            @RequestParam int duration,
            @RequestParam LocalDate date){
        entryService.save(LessonModel.lessonBuilder()
                .description(description)
                .teacher_id(teacher_id)
                .class_id(class_id)
                .duration(duration)
                .date(date)
                .build());
        return "redirect:/schedule";
    }

    @GetMapping("/grade-editor")
    public String ShowGradeForm() {
        return "grade-editor";
    }

    @PostMapping("/grade-editor")
    public String SubmitGradeForm(
            @RequestParam String description,
            @RequestParam int teacher_id,
            @RequestParam int student_id,
            @RequestParam int value,
            @RequestParam LocalDate date){
        entryService.save(GradeModel.gradeBuilder()
                .description(description)
                .teacher_id(teacher_id)
                .student_id(student_id)
                .value(value)
                .date(date)
                .build());
        return "redirect:/grades";
    }

    @GetMapping("/assignment-editor")
    public String ShowAssignmentForm() {
        return "assignment-editor";
    }

    @PostMapping("/assignment-editor")
    public String SubmitAssignmentForm(
            @RequestParam String description,
            @RequestParam int teacher_id,
            @RequestParam String type,
            @RequestParam LocalDate due){
        entryService.save(AssignmentModel.assignmentBuilder()
                .description(description)
                .teacher_id(teacher_id)
                .type(type)
                .date(due)
                .build());
        return "redirect:/assignments";
    }

    @GetMapping("/meeting-planner")
    public String ShowMeetingForm() {
        return "meeting-planner";
    }

    @PostMapping("/meeting-planner")
    public String SubmitMeetingForm(
            @RequestParam String description,
            @RequestParam LocalDate date){
        entryService.save(MeetingModel.meetingBuilder()
                .description(description)
                .date(date)
                .build());
        return "redirect:/meetings";
    }
}
