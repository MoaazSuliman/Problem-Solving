//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 2, 1};
        int number = 0;
        for (int i : arr) {
            number ^= i;
        }


        System.out.println();
//        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }


    public static int removeDuplicates(int[] nums) {

        int len = nums.length;
        int counter = 0;
        int lastNumber = nums[0];
        long[] removes = new long[9];
        int numberOfRemoves = 0;

        for (int i = 1; i < len; i++) {

            if (counter >= 2) {
                removes[nums[i]]++;
                numberOfRemoves++;
            }

            if (nums[i] == lastNumber) {
                counter++;
            } else {
                lastNumber = nums[i];
                counter = 0;
            }

        }
        return len - numberOfRemoves;
    }
}