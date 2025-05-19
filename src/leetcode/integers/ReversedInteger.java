package leetcode.integers;

// Link https://leetcode.com/problems/reverse-integer/description/
public class ReversedInteger {

    public static void main(String[] args) {
        System.out.println((reverse(-123)));
        // Solved by Math, but you can use string for quick reverse.
    }


    public static int reverse(int x) {
        int max = Integer.MAX_VALUE;// 2,147,483,647
        int min = Integer.MIN_VALUE;// -2,147,483,648
        if (x == max || x == min) return 0;

        int reverse = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            // Why I have a validation to check before the last digit?! to can avoid integer overflow
            if (reverse > max / 10) return 0;
            if (reverse < min / 10) return 0;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return reverse;
    }
}
