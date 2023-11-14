package org.example.cource;

import org.example.participant.Participant;
import org.example.participant.Student;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private int code;
    private List<Participant> participants;

    public Course(String name, int code) {
        this.name = name;
        this.code = code;
        participants = new ArrayList<>();
    }

    public boolean addStudentToThisCourse(Participant student) {
        return participants.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", participants=" + participants +
                '}';
    }
}
