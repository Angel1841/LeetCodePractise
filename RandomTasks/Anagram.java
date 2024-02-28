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

/*

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

*/