package exercises.lsn2;

public class StringSep {
    public static void main(String[] args) {

        String aString = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse. ";
        String[] stringArr = aString.split("\\. ");
//        System.out.println(Arrays.toString(stringArr));
//        -prints whole array
        for(String i: stringArr) {
            System.out.println(i + '.');
        }
    }
}
