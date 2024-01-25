//https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;
import java.util.Scanner;

public class concatenationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {1,2,1};
        int[] k = getConcatenation(nums);
        System.out.println(Arrays.toString(k));

        sc.close();
    }
    public static int[] getConcatenation(int[] nums) {
        int[] temp = new int[2* nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            temp[i+ nums.length] = nums[i];
        }


        return temp;
    }
}
