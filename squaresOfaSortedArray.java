//https://leetcode.com/problems/squares-of-a-sorted-array/description/
import java.util.Arrays;
import java.util.Scanner;

public class squaresOfaSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}
