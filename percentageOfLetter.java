//https://leetcode.com/problems/percentage-of-letter-in-string/
import java.util.Scanner;

public class percentageOfLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "foobar" ;
        char letter = 'o';
        int nums = percentageLetter(s,letter);
        System.out.println(nums);
        sc.close();
    }
    public static int percentageLetter(String s, char letter) {
       /* int count = 0; double nums;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter){
                count++;
            }
        }
        nums = (count/s.length())*100;
        return (int) nums; */
        double count = 0;
        for (char i : s.toCharArray()) {
            if (i == letter) count++;
            else continue;
        }
        double result = (count / s.length()) * 100;
        return (int) result;
    }
}
