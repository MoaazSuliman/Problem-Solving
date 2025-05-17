package leetcode.integers;

// Link: https://leetcode.com/problems/palindrome-number/description/
public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    // Note don't use String.
    // TC: O(log n)
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x % 10 == 0 && x != 0) return false;
        if (x < 10) return true;
        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return x == reverse || x == reverse / 10;
    }


}
