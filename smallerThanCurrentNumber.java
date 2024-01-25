//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
import java.util.Arrays;
import java.util.Scanner;

public class smallerThanCurrentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {8,1,2,2,3};
        int[] k = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(k));

        sc.close();
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp2 = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]){
                    temp2++;
                }
            }
            temp[i] = temp2;
        }
        return temp;
    }
}
