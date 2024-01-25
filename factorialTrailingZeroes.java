//https://leetcode.com/problems/factorial-trailing-zeroes/
import java.util.Scanner;

public class factorialTrailingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = trailingZeroes(n);
        System.out.println(k);

        sc.close();
    }
    public static int trailingZeroes(int n) {

        int temp = n;
        int count = 0;
        for (int i = 5; temp / i >= 1; i *= 5)
            count += temp / i;

        return count;
    }
    public static int fact(int x){

        if (x<=1){
            return 1;
        } else {
            return x*fact(x-1);
        }

    }
}
