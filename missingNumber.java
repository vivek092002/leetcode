//https://leetcode.com/problems/missing-number/
import java.util.Arrays;
import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {3,0,1};
        int k = missingNumber(nums);
        System.out.println(k);

        sc.close();
    }
    public static int missingNumber(int[] nums) {

        int temp = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]){
                temp = i;
                break;
            }
        }

        return temp;
    }
}
