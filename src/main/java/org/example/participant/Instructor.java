package org.example.participant;

import org.example.cource.Course;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Participant{

    private List<Course> subjects;

    public Instructor(String name, int age, int ID) {
        super(name, age, ID);
        subjects = new ArrayList<>();
    }

    public boolean addParticipantToCourse(Participant student, Course course) {
        for (Course currentCourse : subjects) {
            if (currentCourse.equals(course)) {
                return currentCourse.addStudentToThisCourse(student);
            }
        }
        return false;
    }

    public boolean addCourseToInstructorSubjects(Course course) {
        return subjects.add(course);
    }

    public List<Course> getSubjects() {
        return subjects;
    }
}
