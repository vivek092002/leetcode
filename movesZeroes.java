//https://leetcode.com/problems/move-zeroes/
import java.util.Arrays;
import java.util.Scanner;

public class movesZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        sc.close();
    }
    public static void moveZeroes(int[] nums) {

        int[] temp = new int[nums.length];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                temp[a++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}

