//https://leetcode.com/problems/find-peak-element/
import java.util.Scanner;

public class peakElemet {
    public static int findPeakElement(int[] nums) {


        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1])
            {
                start=mid+1;
            }
            else
                end=mid;
        }
        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int result = findPeakElement(nums);
        System.out.println(result);
        sc.close();
    }
}
