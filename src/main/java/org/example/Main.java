package org.example;

import org.example.cource.Course;
import org.example.cource.CourseManager;
import org.example.participant.Instructor;
import org.example.participant.Participant;
import org.example.participant.Student;

public class Main {
    public static void main(String[] args) {
        // Creating new students to join in a course
        Student student1 = new Student("Galin", 21, 377919);
        Student student2 = new Student("Kristiyan", 20, 377920);

        // Creating new instructor to  in the course
        Instructor instructor1 = new Instructor("Ivan Zahariev", 33, 9987585);

        // Creating the course
        Course course1 = new Course("OOP", 8888);

        // And creating the CourseManager to manage every course
        CourseManager courseManager = new CourseManager();
        courseManager.addCourseToCourseManagerList(course1);

        // The instructor can add students to course
        instructor1.addCourseToInstructorSubjects(course1);
        instructor1.addParticipantToCourse(student1, course1);
        instructor1.addParticipantToCourse(student2, course1);

        // adding grades to students
        student1.addGrade(6);
        student2.addGrade(5);

        // Printing all information needed
        System.out.println(courseManager.getAllCoursesAndTheirParticipants());

        // Removing current course from CourseManager
        courseManager.removeCourseFromCourseManagerList(course1);

        // Printing to see that the course is removed
        System.out.println(courseManager.getAllCoursesAndTheirParticipants());
    }
}