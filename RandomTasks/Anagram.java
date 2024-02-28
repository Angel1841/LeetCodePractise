import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isAnagram = true;

        char[] s = scanner.nextLine().toCharArray();
        char[] t = scanner.nextLine().toCharArray();

        Arrays.sort(s);
        Arrays.sort(t);

        //Arrays.equals()
        System.out.println(isAnagram);



    }





}

