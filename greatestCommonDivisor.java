//https://leetcode.com/problems/find-greatest-common-divisor-of-array/
import java.util.Arrays;
import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {2,5,6,9,10};
        int k = findGCD(nums);
        System.out.println(k);

        sc.close();
    }
    public static int findGCD(int[] nums) {

        int temp = 1;
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        for (int i = 1; i <= max && i <= min; i++) {
            if ((max % i)==0 && (min % i)==0){
                temp = i;
            }
        }

        return temp;
    }
}
