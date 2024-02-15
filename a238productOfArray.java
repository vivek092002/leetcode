//https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;

public class a238productOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] temp = productExceptSelf(nums);
        System.out.println(Arrays.toString(temp));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int temp2 = 0;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = 1;
            for (int j = 0; j < n; j++) {
                if (i!=j)
                    temp *= nums[j];
            }
            answer[temp2++] = temp;
        }

        return answer;
    }
}
