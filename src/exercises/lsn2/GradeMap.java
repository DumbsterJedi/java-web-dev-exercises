package exercises.lsn2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeMap {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        Integer newID;
        String newStudent;

        Scanner input = new Scanner(System.in);
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID number: ");
                newID = input.nextInt();
                students.put(newID,newStudent);

                input.nextLine();
            }

        } while(!newStudent.equals(""));

        for (Map.Entry<Integer,String> i: students.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }
}
