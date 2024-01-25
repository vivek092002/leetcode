//https://leetcode.com/problems/shuffle-string/
import java.lang.module.FindException;
import java.util.Scanner;

public class suffelString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String str = restoreString(s,indices);
        System.out.println(str);
        sc.close();
    }
    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }

        return new String(arr);
    }
}
