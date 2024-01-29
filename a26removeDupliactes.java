//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
import java.util.Scanner;

public class a26removeDupliactes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        //input array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = removeDuplicates(nums);
        System.out.println(ans);
        sc.close();
    }
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1 ; j<nums.length ; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return (i+1);
    }
}
// uses two pointer alogorithm
