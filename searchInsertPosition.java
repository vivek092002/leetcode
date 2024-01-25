//https://leetcode.com/problems/search-insert-position/
import java.util.Scanner;

public class searchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {};
        int target = sc.nextInt();

        int k = searchInsert(nums, target);


        sc.close();
    }

    public static int searchInsert(int[] nums, int target) {

                int start = 0;
                int end = nums.length - 1;

                // Traverse the search space
                while (start <= end) {
                    int mid = (start + end) / 2;

                    // If K is found
                    if (nums[mid] == target)
                        return mid;

                    else if (nums[mid] < target)
                        start = mid + 1;

                    else
                        end = mid - 1;
                }

                // Return insert position
                return end + 1;
    }
}
