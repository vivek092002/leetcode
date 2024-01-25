//https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
import java.util.Arrays;
import java.util.Scanner;

public class minimizeMaxPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {3,5,4,2,4,6};
        int k = minPairSum(nums);
        System.out.println(k);

        sc.close();
    }
    public static int minPairSum(int[] nums) {

        Arrays.sort(nums);
        int[] temp = new int[(nums.length)];
        int k = 0;
        for (int i = 0, j = nums.length-1;  i <= j ; i++, j--) {
            temp[k] = nums[i] + nums[j];
            k++;
        }

        return Arrays.stream(temp).max().getAsInt();
    }
}
