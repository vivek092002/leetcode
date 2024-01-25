//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
import java.util.Scanner;

public class absoluteDifferenceK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,2,1};
        int k = 1;
        int x = countKDifference(nums,k);
        System.out.println(x);
        sc.close();
    }
    public static int countKDifference(int[] nums, int k) {
        
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (Math.abs(nums[i]-nums[j]) == k){
                    temp++;
                }
            }
        }
        
        return temp;
    }
}
