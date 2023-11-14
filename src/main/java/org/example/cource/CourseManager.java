package org.example.cource;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private List<Course> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    public boolean addCourseToCourseManagerList(Course course) {
        return courses.add(course);
    }

    public boolean removeCourseFromCourseManagerList(Course course) {
        return courses.remove(course);
    }

    public String getAllCoursesAndTheirParticipants() {
        return courses.toString();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
