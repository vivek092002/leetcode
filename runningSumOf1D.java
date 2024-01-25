//https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;
import java.util.Scanner;

public class runningSumOf1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {3,1,2,10,1};
        int[] k = runningSum(nums);
        System.out.println(Arrays.toString(k));

        sc.close();
    }
    public static int[] runningSum(int[] nums) {

        int[] sum = new int[nums.length];
      //  Arrays.sort(nums);
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i-1] + nums[i];
        }

        return sum;

    }
}
