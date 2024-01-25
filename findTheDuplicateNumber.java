//https://leetcode.com/problems/find-the-duplicate-number/
import java.util.Scanner;

public class findTheDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {1,3,4,2,2};
        int k = findDuplicate(nums);
        System.out.println(k);

        sc.close();
    }
    public static int findDuplicate(int[] nums) {

       int temp = 0 ;
        for (int i = 0; i < nums.length; i++) {
            temp = temp^i^nums[i];
        }


        return temp;
    }
}
