//https://leetcode.com/problems/single-number/
import java.util.Scanner;

public class singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {4,1,2,1,2};
        int k = singleNumber(nums);
        System.out.println(k);

        sc.close();
    }
    public static int singleNumber(int[] nums) {

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = temp^nums[i];
        }

        return temp;

    }
}
