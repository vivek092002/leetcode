import java.util.Scanner;

//https://leetcode.com/problems/power-of-three/description/
public class powerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPowerOfThree(n);
        System.out.println(ans);
        sc.close();
    }

    public static boolean isPowerOfThree(int n) {

        if (n==1){
            return true;
        }
        if (n<=0){
            return false;
        }
        if (n%3==0){
            return isPowerOfThree(n/3);
        }
        return false;
    }
}
