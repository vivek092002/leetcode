//https://leetcode.com/problems/count-primes/
import java.util.Scanner;

public class countPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(countPrimes(n));

        sc.close();
    }
    public static int countPrimes(int n) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int i){
        if(i<=1){
            return false;
        }
        if (i<=3){
            return true;
        }
        if (i%2==0 || i%3==0){
            return false;
        }

        for (int j = 5; j*j <= i; j=j+6) {
            if (i%j==0 || i%(j+2)==0){
                return false;
            }
        }

        return true;
    }
}
