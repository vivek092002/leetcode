//https://leetcode.com/problems/single-element-in-a-sorted-array/
import java.util.Scanner;

public class singleElementinaSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {1,1,2,3,3,4,4,8,8};
        int k =  singleNonDuplicate(nums);
        System.out.print(k);

        sc.close();
    }
    public static int singleNonDuplicate(int[] nums) {

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = temp ^ nums[i];
        }
        return temp;
    }
}
