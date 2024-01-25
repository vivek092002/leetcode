//https://leetcode.com/problems/unique-paths/description/
import java.util.Scanner;

public class uniquePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int temp = uniquePaths(m,n);
        System.out.println(temp);
        sc.close();
    }

    public  static  int uniquePaths(int m, int n){

        long answer = 1;

        for (int i = 1; i <= m-1; i++) {
            answer = answer*(n-1+i)/i;
        }
        

        return (int)answer;
    }
}
