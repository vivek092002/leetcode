//https://leetcode.com/problems/count-integers-with-even-digit-sum/
import java.util.Scanner;

public class integersWithEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = countEven(n);
        System.out.println(k);

        sc.close();
    }
    public static int countEven(int num) {

        int count = 0;

        for (int j = 2; j <= num; j++) {
            int i = j;
            int temp = 0;
            while (i != 0 ){
                temp += i % 10;
                i = i / 10;
            }
            if (temp % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
