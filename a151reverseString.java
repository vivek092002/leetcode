import java.util.Scanner;

public class a151reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Enter the String");
        str = sc.nextLine();
        String s = reverseWords(str);
        System.out.println(s);
        sc.close();
    }
    public static String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");
        int left = 0;
        int right = s.length() - 1;

        String temp = "";
        String ans = "";

        while (left <= right)
        {
            char ch = s.charAt(left);
            if (ch != ' ')
            {
                temp += ch;
            }
            else if (ch == ' ')
            {
                if (!ans.equals(""))
                {
                    ans = temp + " " + ans;
                }
                else
                {
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }
        if (!temp.equals(""))
        {
            if (!ans.equals(""))
            {
                ans = temp + " " + ans;
            }
            else
            {
                ans = temp;
            }
        }
        return ans;
    }
}
