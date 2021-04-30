package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    String topic;
    String teacher;
    ArrayList <Student> enrolledStudents;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(topic, course.topic) && Objects.equals(teacher, course.teacher) && Objects.equals(enrolledStudents, course.enrolledStudents);
    }

public String toString(){
    return this.teacher + " is teaching " + this.topic;
}

    public static void main(String[] args) {
        Course someCourseProbably = new Course();
        someCourseProbably.teacher = "Mr.Donald";
        someCourseProbably.topic = "Learning 101";
        System.out.println(someCourseProbably.toString());

        System.out.println(someCourseProbably.topic.equals("Learning 101"));
    }




}
