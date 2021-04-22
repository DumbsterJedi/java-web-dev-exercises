package exercises.lsn2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

//    method for adding all even numbers in an ArrayList
    public static Integer addNums(ArrayList<Integer> aList){
        Integer sum = 0;
        for(Integer i: aList){
            if(i%2 == 0){
                sum += i;
            }
        }
        return sum;
    };


    public static void print5LetterWords(ArrayList<String> aList,int count){
      for(String i: aList){
          if(i.length() == count){
            System.out.println(i);
          }
      }
    };

//    building ArrayLists and printing addNums() and 5 letter words
    public static void main(String[] args) {

        ArrayList<Integer> someNums = new ArrayList<>();
        for(Integer i = 1; i < 11; i++){
        someNums.add(i);
                    };

        ArrayList<String> someWords = new ArrayList<>();
        someWords.add("Taco");
        someWords.add("Turbo");
        someWords.add("Bulldog");
        someWords.add("Donut");

        System.out.println(addNums(someNums));

        Scanner input = new Scanner(System.in);
        System.out.println("How many letters?");
        int count = input.nextInt();
        print5LetterWords(someWords, count);
    }
}