//https://leetcode.com/problems/number-of-good-pairs/
import java.util.Scanner;

public class numberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {1,2,3,1,1,3};
        int k = numIdenticalPairs(nums);
        System.out.println(k);

        sc.close();
    }
    public static int numIdenticalPairs(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    temp++;
                }
            }
        }

        return temp;
    }
}
