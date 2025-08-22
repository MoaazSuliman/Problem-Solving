package leetcode.strings;

//https://leetcode.com/problems/reverse-string/description/
public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c'};
        reverse(s);
        System.out.println(s);
    }

    public static void reverse(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

}
