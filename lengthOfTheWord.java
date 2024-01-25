import java.util.Scanner;

public class lengthOfTheWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int k = lengthOfLastWord(str);
        System.out.println(k);

        sc.close();
    }

    public static int lengthOfLastWord(String s) {

        int temp = s.length() - 1;
        while (temp >= 0 && s.charAt(temp) == ' ') {
            temp--;
        }
        int temp2 = temp;
        while (temp >= 0 && s.charAt(temp) != ' ') {
            temp--;
        }
        return temp2 - temp;

    }
}
