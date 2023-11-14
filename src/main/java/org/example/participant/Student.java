package org.example.participant;

import java.util.ArrayList;
import java.util.List;

public class Student extends Participant {
    private List<Integer> grades;

    public Student(String name, int age, int ID) {
        super(name, age, ID);
        grades = new ArrayList<>();
    }

    public boolean addGrade(int grade) {
        return grades.add(grade);
    }

    public int removeGrade(int grade) {
        return grades.remove(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", grades=" + grades +
                '}';
    }
}
