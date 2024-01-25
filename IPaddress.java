//https://leetcode.com/problems/defanging-an-ip-address/
import java.util.Scanner;

public class IPaddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String temp = defangIPaddr(str);
        System.out.println(temp);


        sc.close();
    }
    public static String defangIPaddr(String address) {

        String str2 = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.'){
                str2 += "[.]";
            } else {
                str2 += address.charAt(i);
            }
        }
        return str2;
    }
}
