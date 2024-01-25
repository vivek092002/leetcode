//https://leetcode.com/problems/median-of-two-sorted-arrays/
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class medianOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        double ans = findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);

        sc.close();
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int[] arr = new int[nums1.length+ nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // traverse the arr1 and insert its element in arr3
        while(i < nums1.length){
            arr[k++] = nums1[i++];
        }

        // now traverse arr2 and insert in arr3
        while(j < nums2.length){
            arr[k++] = nums2[j++];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        double temp = (arr[0] + arr[arr.length-1])/2.0;
        return temp;
    }
}
