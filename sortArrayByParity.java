//https://leetcode.com/problems/sort-array-by-parity/
import java.util.Arrays;
import java.util.Scanner;

public class sortArrayByParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3,1,2,4};
        int[] temp2 = sortArrayByParity(nums);
        System.out.println(Arrays.toString(temp2));
        sc.close();
    }
    public static int[] sortArrayByParity(int[] nums) {
        int[] temp = new int[nums.length];
        int start = 0;
        int end = nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                temp[start] = nums[i];
                start++;
            } else {
                temp[end] = nums[i];
                end--;
            }
        }
        return temp;
    }
}
