//https://leetcode.com/problems/merge-sorted-array/description/
import java.util.Arrays;
import java.util.Scanner;

public class mergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = {1,2,3};
        int m = sc.nextInt();
        int[] nums2 = {2,5,6};
        int n = sc.nextInt();
        merge(nums1,m,nums2,n);
        sc.close();
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i>=0 && j>=0){
            if (nums1[i] > nums2[i]){
                nums1[k] = nums1[i];
                i--; k--;
            } else {
                nums1[k] = nums2[j];
                j--; k--;
            }
        }
        while(i >= 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
