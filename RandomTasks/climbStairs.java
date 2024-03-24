public class climbStairs {

    static class Solution {
        public int climbStairs(int n) {
            if (n == 0 || n == 1) {return 1;}
            return climbStairs (n - 1) + climbStairs (n - 2);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.climbStairs(1);
        solution.climbStairs(2);
        solution.climbStairs(5);

    }

}
