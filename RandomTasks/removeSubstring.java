import java.util.Scanner;

public class removeSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String sentence = scanner.nextLine();

        int index = sentence.indexOf(toRemove);

         String first = sentence.substring(0, index);
         String second = sentence.substring(index + toRemove.length());

         sentence = first + second;

        System.out.println(sentence);

    }
}
