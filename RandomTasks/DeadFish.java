//Write a simple parser that will parse and run Deadfish.
//
//Deadfish has 4 commands, each 1 character long:
//
//i increments the value (initially 0)
//d decrements the value
//s squares the value
//o outputs the value into the return array
//Invalid characters should be ignored.
//
//Deadfish.parse("iiisdoso") =- new int[] {8, 64};

import java.util.Arrays;

public class DeadFish {
    static int countO(String data){
        int count = 0;
        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == 'o'){
                count++;
            }
        }

        return count;
    }
    public static int[] parse(String data) {
        int result = 0;
        int countO = countO(data);

        int[] resultArr = new int[countO];
        int index = 0;

        char[] tokens = data.toCharArray();

        for (var item: tokens) {
            switch (item){
                case 'i':
                    result++;
                    break;
                case 'd':
                    result--;
                    break;
                case 's':
                    result *= result;
                    break;
                case 'o':
                    resultArr[index] = result;
                    index++;
                    break;
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdoso")));
    }
}
