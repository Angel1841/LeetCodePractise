//Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"
//
//Your task is to process a string with "#" symbols.
//
//Examples
//"abc#d##c"      ==>  "ac"
//"abc##d######"  ==>  ""
//"#######"       ==>  ""
//""              ==>  ""

public class backspacesInString {
    static String cleanString(String s) {
        StringBuilder sb = new StringBuilder();

        char[] tokens = s.toCharArray();


        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i] != '#'){
                sb.append(tokens[i]);
            } else {
                if(sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(cleanString("abc#d##c"));
    }
}
