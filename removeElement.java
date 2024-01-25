//https://leetcode.com/problems/remove-element/

import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = sc.nextInt();
       int k =  removeElement(nums,val);
        System.out.println(k);
        sc.close();
    }
    public static int removeElement(int[] nums, int val) {
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[temp++] = nums[i];
            }
        }
        return temp;
    }
}
