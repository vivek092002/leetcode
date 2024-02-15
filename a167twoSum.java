//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
import java.util.Arrays;

public class a167twoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] temp = twoSum(arr,target);
        System.out.println(Arrays.toString(temp));
    }
    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length-1;

        while (numbers[left] + numbers[right] != target){
            if (numbers[left] + numbers[right] <  target)
                left++;
            else
                right--;
        }

        return new int[] {left+1, right+1};
    }
}
