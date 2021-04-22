package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {
    String className;
    int difficulty;
    HashMap<String, Integer> something = new HashMap<>();

    Course(String className, int difficulty,HashMap something){
        this.className= className;
        this.difficulty = difficulty;
        this.something = something;
    }
}
