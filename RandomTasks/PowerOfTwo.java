import java.util.Scanner;

class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {

        return n > 0 && (n & n - 1) == 0;

    }

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(isPowerOfTwo(n));
    }

}

/*

Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.


Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16


 */





