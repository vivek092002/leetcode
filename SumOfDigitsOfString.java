//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/description/
import java.util.Scanner;

public class SumOfDigitsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "iiii";
        int k = 2;
        int ans = getLucky(s,k);
        System.out.println(ans);
        sc.close();
    }

    public static int getLucky(String s, int k) {
        int nums = 0;
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            n += s.charAt(i) - 'a' + 1;
        }
        while (k-- > 0) {
            nums = 0;
            for(char c: n.toCharArray()){
                nums += Integer.parseInt(c + "");
            }
            n = String.valueOf(nums);
        }
        return nums;
    }
}
