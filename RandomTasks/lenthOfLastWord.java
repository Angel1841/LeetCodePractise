import java.util.Scanner;

public class lenthOfLastWord {

    static class Solution {
        public int lengthOfLastWord(String s) {
            String[] res = s.trim().split(" ");
            return res[res.length-1].length();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.lengthOfLastWord("   fly me   to   the moon  ");
        solution.lengthOfLastWord("luffy is still joyboy");

    }

    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    //
    //A word is a maximal
    //substring
    // consisting of non-space characters only.

}
