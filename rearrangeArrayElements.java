//https://leetcode.com/problems/rearrange-array-elements-by-sign/
import java.util.Arrays;
import java.util.Scanner;

public class rearrangeArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
        sc.close();
    }
    public static int[] rearrangeArray(int[] nums) {

        int[] temp = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                temp[count] = nums[i];
                count = count + 2;
            }
        }
        int count1 = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                temp[count1] = nums[i];
                count1 = count1 + 2;
            }
        }
        return temp;
    }
}
