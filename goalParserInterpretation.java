//https://leetcode.com/problems/goal-parser-interpretation/
import java.util.Scanner;

public class goalParserInterpretation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = interpret(str);
        System.out.println(str2);

        sc.close();
    }

    public static String interpret(String command) {

        String temp = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G'){
                temp += "G";
            } else if (command.charAt(i) == '('){
                if (command.charAt(i+1) == ')'){
                    temp += "o";
                    i++;
                } else if (command.charAt(i+1) == 'a'){
                    temp += "al";
                    i = i + 4;
                }
            }
        }
        return temp;
    }
}
