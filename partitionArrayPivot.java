import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/partition-array-according-to-given-pivot/
public class partitionArrayPivot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
        sc.close();
    }
    public static int[] pivotArray(int[] nums, int pivot) {

        int count = 0;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot){
                temp[count++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot){
                temp[count++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot){
                temp[count++] = nums[i];
            }
        }
        return temp;
    }
}
