//Count the number of Duplicates
//Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//
//Example
//"abcde" -> 0 # no characters repeats more than once
//"aabbcde" -> 2 # 'a' and 'b'
//"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//"indivisibility" -> 1 # 'i' occurs six times
//"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//"aA11" -> 2 # 'a' and '1'
//"ABBA" -> 2 # 'A' and 'B' each occur twice

import java.util.HashMap;

public class countDuplicates {
    public static int duplicateCount(String text) {

        int count[] = new int[256];
        int finalRes = 0;
        for (int i = 0; i < text.length(); i++) {
            count[Character.toLowerCase(text.charAt(i))]++;
        }
        for (int i = 0; i < 256; i++) {
            if(count[i] > 1){
                finalRes++;
            }
        }

        return finalRes;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCountHashMap("indivisibility"));
    }

    public static int duplicateCountHashMap(String text) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: text.toLowerCase().toCharArray()) {
            if(map.containsKey(c)){
                map.put(c, 1);
            } else if (!map.containsKey(c)){
                map.put(c, 0);
            }

        }
        return (int)map.values().stream().filter(s -> s > 0).count();
    }

}
