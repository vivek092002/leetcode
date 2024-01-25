
//https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
import java.util.Scanner;

public class aBeforeB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int flag = 0;
        for (int i = 1; i < str.length() ; i++) {

            if (str.charAt(i-1)=='b' && str.charAt(i)=='a'){
                flag++;
                break;
            }
        }
        if (flag == 0){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        sc.close();
    }
}
