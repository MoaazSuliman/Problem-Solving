package leetcode.integers;


// Link: https://leetcode.com/problems/single-number/
public class SingleNumber {

    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            singleNumber ^= nums[i];
        }
        return singleNumber;
    }
}
