//Given a string of words, you need to find the highest scoring word.
//
//Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//For example, the score of abad is 8 (1 + 2 + 1 + 4).
//
//You need to return the highest scoring word as a string.
//
//If two words score the same, return the word that appears earliest in the original string.
//
//All letters will be lowercase and all inputs will be valid.

public class highestScoringWord {

    public static String high(String s) {

        String highestScoring = "";
        String[] words = s.split(" ");
        int maxVal = Integer.MIN_VALUE;


        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            int currVal = 0;

            for (int j = 0; j < word.length(); j++) {
                currVal += (word.charAt(j) - 96);
            }

            if(currVal > maxVal){
                maxVal = currVal;
                highestScoring = word;
            }
        }

        return highestScoring;
    }

    public static void main(String[] args) {
        System.out.println(high("what time are we climbing up to the volcano"));
    }
}
