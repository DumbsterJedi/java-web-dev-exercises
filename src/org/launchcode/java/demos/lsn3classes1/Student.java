package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }

    public int getStudentId(){
        return studentId;
    }
    private void setStudentId(int aId){
        studentId = aId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }
    public void setGpa(double aGpa){
        gpa = aGpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(student.gpa, gpa) == 0 && Objects.equals(name, student.name);
    }

    
    Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        this.studentId = studentId;
    }
    public String getGradeLevel(){
        if(this.numberOfCredits <= 29){
            return "Freshman";
        } else if(this.numberOfCredits >= 30 && this.numberOfCredits <=59){
            return "Sophomore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <=89){
            return "Junior";
        } else {return "Senior";}
    }
    public void addGrade(int numOfCourseCredits,double grade){
        double totalQualityScore = this.gpa*this.numberOfCredits;
        totalQualityScore += grade/numOfCourseCredits;
        this.numberOfCredits +=numOfCourseCredits;
        this.gpa = totalQualityScore/this.numberOfCredits;

    }

    public static void main(String[] args) {

        Student Bob = new Student("Bob", 34, 27, 2);
        System.out.println(Bob.gpa);
        Bob.addGrade(3,4);
        System.out.println(Bob.gpa);
    }

}