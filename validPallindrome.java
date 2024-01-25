//https://leetcode.com/problems/valid-palindrome/
import java.util.Scanner;

public class validPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean k = isPalindrome(str);
        System.out.println(k);
        sc.close();
    }
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        String str2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>=97 && s.charAt(i)<=122 || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                str2 += s.charAt(i);
            }
        }
        String str3 = "";
        // System.out.println(str2);
        for (int i = str2.length()-1 ; i >= 0 ; i--) {
            str3 += str2.charAt(i);
        }
        if (str3.equals(str2)){
            return true;
        } else {
            return false;
        }
    }
}
