import java.util.Scanner;
//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/

public class a2535DigitandElementDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 15, 6, 3};
        int temp = differenceOfSum(nums);
        System.out.println(temp);
        sc.close();
    }

    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
        }

        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = sumOfDigits(nums[i]);
            digitSum += temp;
        }

        return Math.abs(elementSum - digitSum);
    }

    private static int sumOfDigits(int num){
        int sum = 0;
        int d = 0;
        while (num>0){
            d = num % 10;
            sum = sum + d;
            num /= 10;
        }
        return sum;
    }
}
