package exercises.lsn2;

public class ArrayPractice1 {

    public static void main(String[] args) {
    int[] anArray = {1, 1, 2, 3, 5, 8};
        for (int i : anArray) {
            if(i%2 == 1) {
                System.out.println(i);
            }
        }
    }
}
