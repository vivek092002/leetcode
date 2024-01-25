//https://leetcode.com/problems/multiply-strings/
//wrong
import java.util.Scanner;

public class multiplyStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = "";
        String num2 = "";

        System.out.println(multiply(num1,num2));

        sc.close();
    }
    public static String multiply(String num1, String num2) {

        int temp = Integer.parseInt(num1);
        int temp2 = Integer.parseInt(num2);

        String str = String.valueOf(temp*temp2);

        return str;

    }
}
