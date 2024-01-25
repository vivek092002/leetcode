//https://leetcode.com/problems/xor-operation-in-an-array/
import java.util.Scanner;

public class xorOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
    public int xorOperation(int n, int start) {

        int temp = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2*i;
        }
        for (int i = 0; i < n; i++) {
            temp = temp ^ nums[i];
        }
        return temp;
    }
}
