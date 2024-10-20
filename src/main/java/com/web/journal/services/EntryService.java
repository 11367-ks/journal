package com.web.journal.services;

import com.web.journal.models.*;
import com.web.journal.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {
    @Autowired
    private EntryRepository entryRepository;
    @Autowired
    private LessonRepository lessonRepository;
    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private AssignmentRepository assignmentRepository;
    @Autowired
    private MeetingRepository meetingRepository;

    public EntryModel save(EntryModel entry) {
        return this.entryRepository.save(entry);
    }
    public void delete(Long id) {
        entryRepository.deleteById(id);
    }
    public List<LessonModel> getAllLessons() {
        return lessonRepository.findAll();
    }
    public List<GradeModel> getAllGrades() { return gradeRepository.findAll(); }
    public List<AssignmentModel> getAllAssignments() { return assignmentRepository.findAll(); }
    public List<MeetingModel> getAllMeetings() { return meetingRepository.findAll(); }
}
